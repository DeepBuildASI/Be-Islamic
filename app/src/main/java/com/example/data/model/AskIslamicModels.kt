package com.example.data.model

data class AskEvidenceResponse(
    val query: String,
    val verificationId: String,
    val theologicalSummary: String,
    val quranRef: String,
    val quranArabic: String,
    val quranTranslation: String,
    val hadithCollection: String,
    val hadithChapter: String,
    val hadithArabic: String,
    val hadithTranslation: String,
    val hadithGrading: String, // "Sahih (Authentic)"
    val hadithIsnadNote: String,
    val tafseerSource: String,
    val tafseerCommentary: String,
    val scholarlyConsensusIjma: String,
    val isnadChain: List<String>,
    val lexicalRootAnalysis: String,
    val codexCount: Int = 3
)
