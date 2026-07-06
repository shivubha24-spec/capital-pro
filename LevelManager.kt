package com.crushshiv.app.game

data class Level(
    val number: Int,
    val targetScore: Int,
    val moves: Int
)

class LevelManager {

    private val levels = mutableListOf<Level>()

    init {
        generateLevels()
    }

    private fun generateLevels() {
        for (i in 1..1000) {
            levels.add(
                Level(
                    number = i,
                    targetScore = 500 + (i * 100),
                    moves = if (i <= 20) 30 else 25
                )
            )
        }
    }

    fun getLevel(level: Int): Level {
        return levels[level - 1]
    }

    fun totalLevels(): Int {
        return levels.size
    }
}
