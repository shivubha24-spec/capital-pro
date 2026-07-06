package com.crushshiv.app.game

class GameLogic {

    var score = 0

    fun swap(
        board: MutableList<MutableList<CandyType>>,
        row1: Int,
        col1: Int,
        row2: Int,
        col2: Int
    ) {
        val temp = board[row1][col1]
        board[row1][col1] = board[row2][col2]
        board[row2][col2] = temp
    }

    fun checkHorizontalMatch(
        board: MutableList<MutableList<CandyType>>
    ): Boolean {

        for (row in board.indices) {
            for (col in 0 until board[row].size - 2) {

                val candy = board[row][col]

                if (
                    candy == board[row][col + 1] &&
                    candy == board[row][col + 2]
                ) {
                    score += 30
                    return true
                }
            }
        }

        return false
    }

    fun checkVerticalMatch(
        board: MutableList<MutableList<CandyType>>
    ): Boolean {

        for (col in board[0].indices) {
            for (row in 0 until board.size - 2) {

                val candy = board[row][col]

                if (
                    candy == board[row + 1][col] &&
                    candy == board[row + 2][col]
                ) {
                    score += 30
                    return true
                }
            }
        }

        return false
    }

    fun getScore(): Int {
        return score
    }
}
