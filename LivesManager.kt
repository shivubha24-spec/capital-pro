package com.crushshiv.app.game

class LivesManager {

    private var lives = 5
    private val maxLives = 5

    fun getLives(): Int {
        return lives
    }

    fun useLife(): Boolean {
        return if (lives > 0) {
            lives--
            true
        } else {
            false
        }
    }

    fun addLife() {
        if (lives < maxLives) {
            lives++
        }
    }

    fun refillLives() {
        lives = maxLives
    }

    fun hasLives(): Boolean {
        return lives > 0
    }
}
