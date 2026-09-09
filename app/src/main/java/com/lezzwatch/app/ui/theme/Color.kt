package com.lezzwatch.app.ui.theme

import androidx.compose.ui.graphics.Color

// Dark palette — the app's primary, default viewing experience. True AMOLED black: the
// background is pure #000000 (so OLED panels can switch those pixels off entirely, saving
// battery and giving genuinely deep blacks — not just "very dark grey"). Surfaces sit only a
// hair above black, just enough for cards/sheets to read as distinct shapes against the background.
val AccentPurple = Color(0xFF7C5CFF)
val AccentPurpleLight = Color(0xFFA78BFF)
val DarkBackground = Color(0xFF000000)
val DarkSurface = Color(0xFF0A0A0A)
val DarkSurfaceVariant = Color(0xFF161616)
val DarkOnBackground = Color(0xFFF2F2F5)
val DarkOnSurfaceMuted = Color(0xFFA6A8B3)
val DarkOutline = Color(0xFF262626)
val ErrorRed = Color(0xFFFF6B6B)
val FavoriteRed = Color(0xFFFF5C7A)
val SuccessGreen = Color(0xFF52D68A)

// Light palette — used only when the user explicitly picks Light (or System resolves to light).
val LightBackground = Color(0xFFFAFAFC)
val LightSurface = Color(0xFFFFFFFF)
val LightSurfaceVariant = Color(0xFFEDEDF3)
val LightOnBackground = Color(0xFF17181C)
val LightOnSurfaceMuted = Color(0xFF6B6D78)
val LightOutline = Color(0xFFE0E1E8)
