package com.fruitflvme.thousandsofcourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import com.fruitflvme.navigation.NavScreen
import com.fruitflvme.thousandsofcourses.ui.theme.ThousandsOfCoursesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge()
        setContent {
            ThousandsOfCoursesTheme {
                NavScreen()
            }
        }
    }
}