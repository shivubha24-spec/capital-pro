package com.crushshiv.app.game

import kotlin.random.Random

class BoardGenerator {

    private val candyTypes = listOf(
        CandyType.RED,
        CandyType.BLUE,
        CandyType.GREEN,
        CandyType.YELLOW,
        CandyType.PURPLE,
        CandyType.ORANGE
    )

    fun generateBoard(rows: Int = 9, cols: Int = 9): Array<Array<CandyType>> {

        val board = Array(rows) {
            Array(cols) {
                candyTypes[Random.nextInt(candyTypes.size)]
            }
        }

        removeStartingMatches(board)

        return board
    }

    private fun removeStartingMatches(board: Array<Array<CandyType>>) {

        for (row in board.indices) {
            for (col in board[row].indices) {

                while (createsMatch(board, row, col)) {
                    board[row][col] =
                        candyTypes[Random.nextInt(candyTypes.size)]
                }
            }
        }
    }

    private fun createsMatch(
        board: Array<Array<CandyType>>,
        row: Int,
        col: Int
    ): Boolean {

        if (col >= 2) {
            if (
                board[row][col] == board[row][col - 1] &&
                board[row][col] == board[row][col - 2]
            ) {
                return true
            }
        }

        if (row >= 2) {
            if (
                board[row][col] == board[row - 1][col] &&
                board[row][col] == board[row - 2][col]
            ) {
                return true
            }
        }

        return false
    }
}
