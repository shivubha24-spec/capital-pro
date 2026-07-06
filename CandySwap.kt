package com.crushshiv.app.game

class CandySwap {

    fun swap(
        board: Array<Array<CandyType>>,
        firstRow: Int,
        firstCol: Int,
        secondRow: Int,
        secondCol: Int
    ): Boolean {

        // Check board limits
        if (firstRow !in board.indices ||
            secondRow !in board.indices ||
            firstCol !in board[0].indices ||
            secondCol !in board[0].indices
        ) {
            return false
        }

        // Allow only adjacent candies
        val distance =
            kotlin.math.abs(firstRow - secondRow) +
            kotlin.math.abs(firstCol - secondCol)

        if (distance != 1) {
            return false
        }

        // Swap candies
        val temp = board[firstRow][firstCol]
        board[firstRow][firstCol] = board[secondRow][secondCol]
        board[secondRow][secondCol] = temp

        return true
    }
}
