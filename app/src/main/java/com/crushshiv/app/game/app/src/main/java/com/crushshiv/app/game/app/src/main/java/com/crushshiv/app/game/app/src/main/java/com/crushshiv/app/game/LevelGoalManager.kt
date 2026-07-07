package com.crushshiv.app.game

data class LevelGoal(
    val level: Int,
    val targetScore: Int,
    val maxMoves: Int,
    val starsRequired: Int
)

class LevelGoalManager {

    private val levels = listOf(

        LevelGoal(
            level = 1,
            targetScore = 500,
            maxMoves = 30,
            starsRequired = 1
        ),

        LevelGoal(
            level = 2,
            targetScore = 1000,
            maxMoves = 28,
            starsRequired = 2
        ),

        LevelGoal(
            level = 3,
            targetScore = 1800,
            maxMoves = 25,
            starsRequired = 3
        ),

        LevelGoal(
            level = 4,
            targetScore = 2500,
            maxMoves = 24,
            starsRequired = 3
        ),

        LevelGoal(
            level = 5,
            targetScore = 3500,
            maxMoves = 22,
            starsRequired = 3
        )
    )

    fun getLevel(level: Int): LevelGoal {
        return levels.find {
            it.level == level
        } ?: levels.first()
    }

    fun isLevelCompleted(
        level: Int,
        score: Int
    ): Boolean {

        return score >= getLevel(level).targetScore
    }

    fun getTargetScore(level: Int): Int {
        return getLevel(level).targetScore
    }

    fun getMoves(level: Int): Int {
        return getLevel(level).maxMoves
    }
}
