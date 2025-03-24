package co.com.japl.ui.enums

import androidx.compose.material3.ColorScheme
import co.com.japl.ui.theme.DarkColorAlameda181Scheme
import co.com.japl.ui.theme.DarkColorTSSScheme
import co.com.japl.ui.theme.LightColorAlameda181Scheme
import co.com.japl.ui.theme.LightColorTSSScheme

enum class ProjectsEnum (val lightColorScheme: ColorScheme,val darkColorScheme: ColorScheme) {
    TorresSanSebastian(LightColorTSSScheme, DarkColorTSSScheme),
    Alameda181 (LightColorAlameda181Scheme,DarkColorAlameda181Scheme);

    fun getDark()  = darkColorScheme
    fun getLight() = lightColorScheme


}

fun getScheme(name:String):ProjectsEnum{
    return ProjectsEnum.entries.first { it.name.lowercase().contains(name.lowercase()) }
}