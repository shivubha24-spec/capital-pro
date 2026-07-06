package com.crushshiv.app.game

import androidx.compose.ui.graphics.Color

data class Candy(
    val id: Int,
    val row: Int,
    val column: Int,
    val color: Color,
    val type: CandyType
)

enum class CandyType {
    RED,
    BLUE,
    GREEN,
    YELLOW,
    PURPLE,
    ORANGE,
    RAINBOW,
    BOMB
}
