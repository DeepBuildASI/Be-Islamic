package com.example.data.model

enum class PrayerType(val displayName: String, val rakahs: String, val period: String, val totalRakahs: Int) {
    FAJR("Fajr (2)", "2 Rakah Sunnah & 2 Rakah Fard", "Dawn", 2),
    ZUHR("Zuhr (4)", "4 Rakah Fard & Sunnah Mu'akkadah", "Noon", 4),
    ASR("Asr (4)", "4 Rakah Fard", "Afternoon", 4),
    MAGHRIB("Maghrib (3)", "3 Rakah Fard & 2 Sunnah", "Sunset", 3),
    ISHA("Isha (4)", "4 Rakah Fard & Witr", "Night", 4)
}

enum class PostureType {
    TAKBEER,
    QIYAM,
    RUKU,
    QAWMAH,
    SUJOOD,
    JALSAH,
    TASHAHHUD,
    TASLEEM
}

data class SalahStep(
    val stepNumber: Int,
    val title: String,
    val subtitle: String,
    val pillarType: String, // "Arkaan (Pillar)" or "Wajib" or "Sunnah"
    val posture: PostureType,
    val postureDescription: String,
    val arabicRecitation: String,
    val transliteration: String,
    val englishTranslation: String,
    val urduTranslation: String,
    val transmissionSource: String,
    val cautionNote: String,
    val spiritualFocus: String
)
