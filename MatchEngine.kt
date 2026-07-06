package com.crushshiv.app.game

class MatchEngine {

    fun findMatches(board: Array<Array<CandyType>>): List<Pair<Int, Int>> {

        val matches = mutableListOf<Pair<Int, Int>>()

        // Horizontal Match
        for (row in board.indices) {
            for (col in 0 until board[row].size - 2) {

                val candy = board[row][col]

                if (
                    candy == board[row][col + 1] &&
                    candy == board[row][col + 2]
                ) {
                    matches.add(Pair(row, col))
                    matches.add(Pair(row, col + 1))
                    matches.add(Pair(row, col + 2))
                }
            }
        }

        // Vertical Match
        for (col in board[0].indices) {
            for (row in 0 until board.size - 2) {

                val candy = board[row][col]

                if (
                    candy == board[row + 1][col] &&
                    candy == board[row + 2][col]
                ) {
                    matches.add(Pair(row, col))
                    matches.add(Pair(row + 1, col))
                    matches.add(Pair(row + 2, col))
                }
            }
        }

        return matches.distinct()
    }

    fun hasMatch(board: Array<Array<CandyType>>): Boolean {
        return findMatches(board).isNotEmpty()
    }
}
