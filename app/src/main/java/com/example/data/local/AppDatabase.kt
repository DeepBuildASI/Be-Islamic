package com.example.data.local

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "bookmarks")
data class BookmarkEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val type: String, // "QURAN", "HADITH", "KALIMAH", "SUNNAH", "SALAH"
    val referenceId: String,
    val title: String,
    val subtitle: String,
    val timestamp: Long = System.currentTimeMillis()
)

@Entity(tableName = "lesson_progress")
data class LessonProgressEntity(
    @PrimaryKey val key: String, // e.g. "salah_fajr", "kalimah_1", "juz_progress"
    val category: String,
    val isCompleted: Boolean,
    val score: Int = 100,
    val lastUpdated: Long = System.currentTimeMillis()
)

@Dao
interface BookmarkDao {
    @Query("SELECT * FROM bookmarks ORDER BY timestamp DESC")
    fun getAllBookmarks(): Flow<List<BookmarkEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookmark(bookmark: BookmarkEntity)

    @Query("DELETE FROM bookmarks WHERE type = :type AND referenceId = :refId")
    suspend fun deleteBookmarkByRef(type: String, refId: String)

    @Query("SELECT EXISTS(SELECT 1 FROM bookmarks WHERE type = :type AND referenceId = :refId)")
    fun isBookmarked(type: String, refId: String): Flow<Boolean>
}

@Dao
interface ProgressDao {
    @Query("SELECT * FROM lesson_progress")
    fun getAllProgress(): Flow<List<LessonProgressEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setProgress(progress: LessonProgressEntity)

    @Query("SELECT isCompleted FROM lesson_progress WHERE `key` = :key LIMIT 1")
    fun isCompleted(key: String): Flow<Boolean?>
}

@Database(entities = [BookmarkEntity::class, LessonProgressEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bookmarkDao(): BookmarkDao
    abstract fun progressDao(): ProgressDao
}
