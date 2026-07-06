package com.crushshiv.app.game

import kotlin.random.Random

class GameBoard {

    private val rows = 9
    private val cols = 9

    val board = MutableList(rows) {
        MutableList(cols) {
            randomCandy()
        }
    }

    private fun randomCandy(): CandyType {
        return when (Random.nextInt(6)) {
            0 -> CandyType.RED
            1 -> CandyType.BLUE
            2 -> CandyType.GREEN
            3 -> CandyType.YELLOW
            4 -> CandyType.PURPLE
            else -> CandyType.ORANGE
        }
    }

    fun getCandy(row: Int, col: Int): CandyType {
        return board[row][col]
    }

    fun setCandy(row: Int, col: Int, candy: CandyType) {
        board[row][col] = candy
    }

    fun resetBoard() {
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                board[r][c] = randomCandy()
            }
        }
    }
}
