package com.crushshiv.app.game

class GravityEngine {

    fun applyGravity(board: Array<Array<CandyType?>>) {

        val rows = board.size
        val cols = board[0].size

        for (col in 0 until cols) {

            var emptyRow = rows - 1

            for (row in rows - 1 downTo 0) {

                if (board[row][col] != null) {

                    board[emptyRow][col] = board[row][col]

                    if (emptyRow != row) {
                        board[row][col] = null
                    }

                    emptyRow--
                }
            }

            while (emptyRow >= 0) {
                board[emptyRow][col] = randomCandy()
                emptyRow--
            }
        }
    }

    private fun randomCandy(): CandyType {

        return when ((0..5).random()) {
            0 -> CandyType.RED
            1 -> CandyType.BLUE
            2 -> CandyType.GREEN
            3 -> CandyType.YELLOW
            4 -> CandyType.PURPLE
            else -> CandyType.ORANGE
        }
    }
}
