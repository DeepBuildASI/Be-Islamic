package com.example.data.model

data class Hadith(
    val id: String,
    val collection: String,
    val collectionAr: String,
    val hadithNumber: String,
    val bookTitle: String,
    val arabic: String,
    val englishTranslation: String,
    val urduTranslation: String,
    val grading: String, // "Sahih", "Hasan"
    val narrator: String,
    val sourceMetadata: String,
    val isnadChain: List<String>
)
