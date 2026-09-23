package com.example.data.model

enum class KidsAgeGroup(val range: String, val focusArea: String) {
    AGE_4_6("4–6 yrs", "Foundations & Short Words"),
    AGE_7_9("7–9 yrs", "Salah & Islamic Manners"),
    AGE_10_12("10–12 yrs", "Quran Comprehension & Duas"),
    AGE_13_PLUS("13+ yrs", "Theological Depth & Daily Life")
}

data class KidsLesson(
    val id: String,
    val title: String,
    val category: String, // "Kalimahs", "Wudu", "Salah", "Short Surahs", "Duas", "Manners", "Stories"
    val ageGroup: KidsAgeGroup,
    val arabicPhrase: String? = null,
    val simpleExplanation: String,
    val learningActivity: String,
    val parentGuide: String,
    val isCompleted: Boolean = false
)
