package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFFFFF),
    onPrimary = Color(0xFF000000),
    primaryContainer = Color(0xFF262930),
    onPrimaryContainer = Color(0xFFE5E7EB),
    secondary = Color(0xFF10B981),
    onSecondary = Color(0xFF000000),
    secondaryContainer = Color(0xFF064E3B),
    onSecondaryContainer = Color(0xFF6EE7B7),
    background = DarkBackground,
    surface = DarkSurface,
    surfaceVariant = DarkSurfaceContainer,
    onBackground = DarkTextPrimary,
    onSurface = DarkTextPrimary,
    onSurfaceVariant = DarkTextSecondary,
    outline = Color(0xFF4B5563),
    outlineVariant = Color(0xFF374151),
    error = RedAlert,
    onError = Color.White,
    errorContainer = Color(0xFF450A0A),
    onErrorContainer = Color(0xFFFCA5A5)
)

private val LightColorScheme = lightColorScheme(
    primary = ObsidianPrimary,
    onPrimary = ObsidianOnPrimary,
    primaryContainer = ObsidianPrimaryContainer,
    onPrimaryContainer = ObsidianOnPrimaryContainer,
    secondary = EmeraldSecondary,
    onSecondary = EmeraldOnSecondary,
    secondaryContainer = EmeraldSecondaryContainer,
    onSecondaryContainer = EmeraldOnSecondaryContainer,
    background = SurfaceBase,
    surface = SurfaceBase,
    surfaceVariant = SurfaceContainer,
    onBackground = TextOnSurface,
    onSurface = TextOnSurface,
    onSurfaceVariant = TextOnSurfaceVariant,
    outline = OutlineNeutral,
    outlineVariant = OutlineVariantNeutral,
    error = RedAlert,
    onError = Color.White,
    errorContainer = RedAlertContainer,
    onErrorContainer = RedOnAlertContainer
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
