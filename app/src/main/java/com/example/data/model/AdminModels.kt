package com.example.data.model

enum class ContentStatus(val displayName: String) {
    DRAFT("Draft"),
    REVIEW("Review"),
    VERIFIED("Verified"),
    PUBLISHED("Published")
}

data class AdminContentItem(
    val id: String,
    val category: String, // Quran, Hadith, Tafseer, Sunnah, Kalimahs, Salah
    val title: String,
    val primarySource: String,
    val authorScholar: String,
    val canonicalReference: String,
    val language: String,
    val status: ContentStatus,
    val lastReviewedDate: String,
    val accreditedReviewer: String
)
