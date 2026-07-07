package com.crushshiv.app.game

class MoveManager {

    private var totalMoves = 30
    private var movesLeft = 30

    fun setMoves(count: Int) {
        totalMoves = count
        movesLeft = count
    }

    fun useMove(): Boolean {
        return if (movesLeft > 0) {
            movesLeft--
            true
        } else {
            false
        }
    }

    fun addMoves(count: Int) {
        movesLeft += count
    }

    fun getMovesLeft(): Int {
        return movesLeft
    }

    fun getTotalMoves(): Int {
        return totalMoves
    }

    fun isGameOver(): Boolean {
        return movesLeft <= 0
    }

    fun reset() {
        movesLeft = totalMoves
    }
}
