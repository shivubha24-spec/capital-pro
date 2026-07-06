package com.crushshiv.app.sound

class SoundManager {

    private var soundEnabled = true
    private var musicEnabled = true


    fun playCandyMatchSound() {
        if (soundEnabled) {
            println("Candy Match Sound")
        }
    }


    fun playSwapSound() {
        if (soundEnabled) {
            println("Candy Swap Sound")
        }
    }


    fun playWinSound() {
        if (soundEnabled) {
            println("Level Complete Sound")
        }
    }


    fun playLoseSound() {
        if (soundEnabled) {
            println("Game Over Sound")
        }
    }


    fun startBackgroundMusic() {
        if (musicEnabled) {
            println("Background Music Started")
        }
    }


    fun stopBackgroundMusic() {
        println("Background Music Stopped")
    }


    fun setSound(enabled: Boolean) {
        soundEnabled = enabled
    }


    fun setMusic(enabled: Boolean) {
        musicEnabled = enabled
    }


    fun isSoundEnabled(): Boolean {
        return soundEnabled
    }


    fun isMusicEnabled(): Boolean {
        return musicEnabled
    }
}
