package com.example.data.model

data class TafseerItem(
    val surahId: Int,
    val surahName: String,
    val ayahNumber: Int,
    val arabicText: String,
    val translation: String,
    val sourceAuthor: String, // e.g. "Ibn Kathir (d. 774 AH)", "Al-Muyassar", "Al-Tabari"
    val rootWord: String,
    val lexicalBreakdown: String,
    val exegesisContent: String,
    val supportingHadith: String,
    val verifiedIsnad: String = "Sahih Isnad"
)
