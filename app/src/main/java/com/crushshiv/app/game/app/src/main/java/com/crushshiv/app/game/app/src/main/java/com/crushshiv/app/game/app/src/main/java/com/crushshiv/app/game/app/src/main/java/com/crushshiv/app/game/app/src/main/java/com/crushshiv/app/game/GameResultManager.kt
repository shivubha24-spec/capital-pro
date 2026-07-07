package com.crushshiv.app.game

data class GameResult(
    val win: Boolean,
    val stars: Int,
    val coinsReward: Int,
    val diamondsReward: Int,
    val nextLevelUnlocked: Boolean
)

class GameResultManager {

    fun calculateResult(
        score: Int,
        targetScore: Int
    ): GameResult {

        if (score < targetScore) {
            return GameResult(
                win = false,
                stars = 0,
                coinsReward = 0,
                diamondsReward = 0,
                nextLevelUnlocked = false
            )
        }

        val stars = when {
            score >= targetScore * 3 -> 3
            score >= targetScore * 2 -> 2
            else -> 1
        }

        val coins = stars * 250
        val diamonds = stars * 5

        return GameResult(
            win = true,
            stars = stars,
            coinsReward = coins,
            diamondsReward = diamonds,
            nextLevelUnlocked = true
        )
    }
}
