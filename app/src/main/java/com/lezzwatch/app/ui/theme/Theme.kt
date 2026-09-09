package com.lezzwatch.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.lezzwatch.app.data.local.prefs.AppTheme

// Material3's darkColorScheme() auto-derives the surfaceContainer* roles (what DropdownMenu,
// ModalBottomSheet, Menu popups, etc. use by default) from `surface` using a tonal-elevation
// formula that tints them noticeably lighter — the usual "dark grey, not black" Material look.
// For a true AMOLED theme every one of those roles needs to be pinned near-black explicitly,
// or floating UI (dropdowns, the channel-drawer sheet) will visibly not match the rest of the app.
private val LezzwatchDarkColors = darkColorScheme(
    primary = AccentPurple,
    onPrimary = DarkOnBackground,
    secondary = AccentPurpleLight,
    background = DarkBackground,
    onBackground = DarkOnBackground,
    surface = DarkSurface,
    onSurface = DarkOnBackground,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = DarkOnSurfaceMuted,
    surfaceContainerLowest = Color(0xFF000000),
    surfaceContainerLow = Color(0xFF0A0A0A),
    surfaceContainer = Color(0xFF0F0F0F),
    surfaceContainerHigh = Color(0xFF151515),
    surfaceContainerHighest = Color(0xFF1A1A1A),
    inverseSurface = DarkOnBackground,
    inverseOnSurface = Color(0xFF000000),
    outline = DarkOutline,
    outlineVariant = Color(0xFF1C1C1C),
    error = ErrorRed,
)

private val LezzwatchLightColors = lightColorScheme(
    primary = AccentPurple,
    onPrimary = LightSurface,
    secondary = AccentPurpleLight,
    background = LightBackground,
    onBackground = LightOnBackground,
    surface = LightSurface,
    onSurface = LightOnBackground,
    surfaceVariant = LightSurfaceVariant,
    onSurfaceVariant = LightOnSurfaceMuted,
    outline = LightOutline,
    error = ErrorRed,
)

/**
 * App theme wrapper. Lezzwatch defaults to dark (this is a video/TV app), but honors the user's
 * explicit Light or System choice from Settings.
 */
@Composable
fun LezzwatchTheme(
    appTheme: AppTheme = AppTheme.DARK,
    content: @Composable () -> Unit,
) {
    val useDarkTheme = when (appTheme) {
        AppTheme.DARK -> true
        AppTheme.LIGHT -> false
        AppTheme.SYSTEM -> isSystemInDarkTheme()
    }
    val colorScheme = if (useDarkTheme) LezzwatchDarkColors else LezzwatchLightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = LezzwatchTypography,
        content = content,
    )
}
