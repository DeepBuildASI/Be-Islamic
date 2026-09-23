package com.example.data.model

data class Course(
    val id: String,
    val title: String,
    val level: String,
    val unitCount: Int,
    val description: String,
    val lessons: List<CourseLesson>
)

data class CourseLesson(
    val lessonId: String,
    val title: String,
    val quranProof: String,
    val quranArabic: String,
    val hadithProof: String,
    val corePrinciple: String,
    val practicalLiving: String,
    val scholarlyNote: String
)
