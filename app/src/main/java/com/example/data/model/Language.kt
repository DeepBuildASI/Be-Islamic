package com.example.data.model

enum class AppLanguage(val code: String, val displayName: String, val nativeName: String, val isRtl: Boolean) {
    ENGLISH("en", "English", "English", false),
    URDU("ur", "Urdu", "اردو", true),
    ARABIC("ar", "Arabic", "العربية", true),
    CHINESE("zh", "Chinese", "中文", false)
}
