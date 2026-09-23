package com.example.data.model

data class SunnahItem(
    val id: String,
    val category: SunnahCategory,
    val title: String,
    val summary: String,
    val quranSource: String,
    val hadithSource: String,
    val hadithArabic: String,
    val sunnahPractice: String,
    val scholarlyExplanation: String,
    val isnadGrade: String = "Sahih"
)

enum class SunnahCategory(val displayName: String, val iconName: String) {
    WORSHIP("Worship", "mosque"),
    CHARACTER("Character", "sentiment_satisfied"),
    FAMILY("Family", "family_restroom"),
    FOOD("Food", "restaurant"),
    CLEANLINESS("Cleanliness", "water_drop"),
    CLOTHING("Clothing", "checkroom"),
    DAILY_MANNERS("Daily manners", "handshake"),
    CHARITY("Charity", "volunteer_activism"),
    COMMUNITY("Community", "groups"),
    MERCY("Mercy", "favorite"),
    HONESTY("Honesty", "balance"),
    PATIENCE("Patience", "hourglass_top")
}
