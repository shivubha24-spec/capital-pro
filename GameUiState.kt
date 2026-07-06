package com.crushshiv.app.viewmodel

import com.crushshiv.app.game.CandyType

data class GameUiState(
    val board: Array<Array<CandyType>> = Array(9) {
        Array(9) { CandyType.RED }
    },
    val score: Int = 0,
    val level: Int = 1,
    val moves: Int = 30,
    val coins: Int = 100,
    val diamonds: Int = 50,
    val lives: Int = 5,
    val gameOver: Boolean = false,
    val levelCompleted: Boolean = false
)
