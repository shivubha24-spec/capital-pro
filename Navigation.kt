package com.crushshiv.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.crushshiv.app.ui.GameScreen
import com.crushshiv.app.ui.HomeScreen

enum class Screen {
    HOME,
    GAME
}

@Composable
fun CrushShivNavigation() {

    val currentScreen = remember {
        mutableStateOf(Screen.HOME)
    }

    when (currentScreen.value) {

        Screen.HOME -> {
            HomeScreen(
                onPlayClick = {
                    currentScreen.value = Screen.GAME
                }
            )
        }

        Screen.GAME -> {
            GameScreen()
        }
    }
}
