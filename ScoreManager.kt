package com.crushshiv.app.game

class ScoreManager {

    private var score = 0

    fun add(points: Int) {
        score += points
    }

    fun reset() {
        score = 0
    }

    fun getScore(): Int {
        return score
    }

    fun reachedTarget(target: Int): Boolean {
        return score >= target
    }
}
