package com.example.data.model

data class Kalimah(
    val id: Int,
    val number: Int,
    val nameEn: String,
    val nameAr: String,
    val titleMeaning: String,
    val arabic: String,
    val transliteration: String,
    val englishTranslation: String,
    val urduTranslation: String,
    val chineseTranslation: String,
    val explanation: String,
    val referenceSource: String,
    val isMemorized: Boolean = false
)
