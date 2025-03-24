package co.com.japl.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val black = Color.Black
val yellow = Color(0xFFBD992C)
val yellow_light = Color(0xFFFFC000)
val green = Color(0xFF39BE59)
val white = Color.White
val backgroundLogo = Color( 0XFF282d29)

val DarkColorAlameda181Scheme = darkColorScheme(
    primary = white,
    secondary = yellow_light,
    background = black,
    primaryContainer = yellow_light,
    onPrimaryContainer = green,
    onPrimary = yellow,
    onSurface = white,
    onSurfaceVariant = white

)

val LightColorAlameda181Scheme = lightColorScheme(
    primary = black,
    secondary = green,
    background = white,
    primaryContainer = green,
    onPrimaryContainer = yellow_light,
    onSurfaceVariant = black

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)