package com.example.data.model

data class SurahInfo(
    val id: Int,
    val nameEn: String,
    val nameAr: String,
    val meaningEn: String,
    val versesCount: Int,
    val revelationType: String, // "Makki" or "Madani"
    val startJuz: Int
)

data class Ayah(
    val surahId: Int,
    val ayahNumber: Int,
    val arabicText: String,
    val transliteration: String,
    val englishTranslation: String,
    val urduTranslation: String,
    val chineseTranslation: String,
    val tafseerExcerpt: String,
    val footnote: String? = null,
    val wordAnalysis: String? = null
)
