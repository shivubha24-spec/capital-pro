package com.crushshiv.app.game

class ComboManager {

    private var comboCount = 0
    private var comboMultiplier = 1

    fun registerMatch(matchCount: Int): Int {

        comboCount++

        comboMultiplier = when {
            comboCount >= 5 -> 5
            comboCount >= 4 -> 4
            comboCount >= 3 -> 3
            comboCount >= 2 -> 2
            else -> 1
        }

        val baseScore = when {
            matchCount >= 5 -> 250
            matchCount == 4 -> 150
            else -> 60
        }

        return baseScore * comboMultiplier
    }

    fun getComboCount(): Int {
        return comboCount
    }

    fun getMultiplier(): Int {
        return comboMultiplier
    }

    fun resetCombo() {
        comboCount = 0
        comboMultiplier = 1
    }

    fun isSuperCombo(): Boolean {
        return comboMultiplier >= 3
    }
}
