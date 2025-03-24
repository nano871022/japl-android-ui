package co.com.japl.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val color_theme_light_primary = Color(0xFF1976D2)
val color_theme_light_on_primary = Color(0xFFBBDEFB)

val color_theme_light_primary_inverse = Color(0xFFBBDEFB)

val color_theme_light_primary_container = Color(0xFF001C3B)
val color_theme_light_on_primary_container = Color(0xFF0990EB)

val color_theme_light_secondary = Color(0xFF1A237E)
val color_theme_light_on_secondary = Color(0xFFFFFFFF)

val color_theme_light_secondary_container = Color(0xFF1A237E)
val color_theme_light_on_secondary_container = Color(0xFFBBDEFB)

val color_theme_light_tertiary = Color(0xAA01579B)
val color_theme_light_on_tertiary = Color(0xFF81DAF4)

val color_theme_light_on_tertiary_container = Color(0xFF001C3B)
val color_theme_light_tertiary_container = Color(0xFF004B7D)

val color_theme_light_on_background = Color(0xFF212121)
val color_theme_light_background = Color(0xFFFAFAFA)

val color_theme_light_surface = Color(0xFF546E7A)
val color_theme_light_on_surface = Color(0xFFFFFFFF)

val color_theme_light_surface_container_low = Color(0xFFFFFFFF)
val color_theme_light_surface_container_highest = Color(0xFF546E7A)

val color_theme_light_surface_container = Color(0xFF1A237E)

val color_theme_light_surface_variant = Color(0xFF95B6C5)
val color_theme_light_on_surface_variant = Color(0xFF001C3B)

val color_theme_light_error = Color(0xFFFF44336)
val color_theme_light_on_error = Color(0xFFFFEBEE)


val color_theme_dark_on_primary = Color(0xFF1976D2)
val color_theme_dark_primary = Color(0xFFBBDEFB)

val color_theme_dark_primary_container = Color(0xFF001C3B)
val color_theme_dark_on_primary_container = Color(0xFF0990EB)

val color_theme_dark_primary_inverse = Color(0xFFBBDEFB)

val color_theme_dark_on_secondary = Color(0xFF1A237E)
val color_theme_dark_secondary = Color(0xFF9FA8DA)

val color_theme_dark_secondary_container = Color(0xFFBBDEFB)
val color_theme_dark_on_secondary_container = Color(0xFF1A237E)

val color_theme_dark_on_tertiary = Color(0xFF01579B)
val color_theme_dark_tertiary = Color(0xFF81DAF4)

val color_theme_dark_on_tertiary_container = Color(0xFF001C3B)
val color_theme_dark_tertiary_container = Color(0xFF004B7D)

val color_theme_dark_background = Color(0xFFFAFAFA)
val color_theme_dark_on_background = Color(0xFF212121)

val color_theme_dark_on_surface = Color(0xFF546E7A)
val color_theme_dark_surface = Color(0xFFCFD8DC)

val color_theme_dark_surface_container = Color(0xFFCFD8DC)
val color_theme_dark_surface_container_highest = Color(0xFFCFD8DC)

val color_theme_dark_on_error = Color(0xFFFF44336)
val color_theme_dark_error = Color(0xFFFFEBEE)

val LightColorTSSScheme = lightColorScheme(
    primary = color_theme_light_on_primary,
    onPrimary = color_theme_light_primary,
    secondary = color_theme_light_secondary,
    onSecondary = color_theme_light_on_secondary,
    tertiary = color_theme_light_tertiary,
    onTertiary = color_theme_light_on_tertiary,
    background = color_theme_light_background,
    onBackground = color_theme_light_on_background,
    surface = color_theme_light_surface,
    surfaceContainerLow = color_theme_light_surface_container_low,
    surfaceContainerHigh = color_theme_light_surface_container_highest,
    surfaceContainer = color_theme_light_surface_container,
    onSurface = color_theme_light_on_surface,
    surfaceVariant = color_theme_light_surface_variant,
    onSurfaceVariant = color_theme_light_on_surface_variant,
    error = color_theme_light_error,
    onError = color_theme_light_on_error,
    onPrimaryContainer = color_theme_light_on_primary_container,
    primaryContainer = color_theme_light_primary_container,
    onSecondaryContainer = color_theme_light_on_secondary_container,
    secondaryContainer = color_theme_light_secondary_container,
    onTertiaryContainer = color_theme_light_on_tertiary_container,
    tertiaryContainer = color_theme_light_tertiary_container,
    inversePrimary = color_theme_light_primary_inverse
)

val DarkColorTSSScheme = darkColorScheme(
    primary = color_theme_dark_primary,
    onPrimary = color_theme_dark_on_primary,
    secondary = color_theme_dark_secondary,
    onSecondary = color_theme_dark_on_secondary,
    tertiary = color_theme_dark_tertiary,
    onTertiary = color_theme_dark_on_tertiary,
    background = color_theme_dark_background,
    onBackground = color_theme_dark_on_background,
    surface = color_theme_dark_surface,
    onSurface = color_theme_dark_on_surface,
    surfaceContainer = color_theme_dark_surface_container,
    surfaceContainerHigh = color_theme_dark_surface_container_highest,
    error = color_theme_dark_error,
    onError = color_theme_dark_on_error,
    primaryContainer = color_theme_dark_primary_container,
    onPrimaryContainer = color_theme_dark_on_primary_container,
    secondaryContainer = color_theme_dark_secondary_container,
    onSecondaryContainer = color_theme_dark_on_secondary_container,
    tertiaryContainer = color_theme_dark_tertiary_container,
    onTertiaryContainer = color_theme_dark_on_tertiary_container,
    inversePrimary = color_theme_dark_primary_inverse

)
