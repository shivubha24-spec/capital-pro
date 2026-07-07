package com.crushshiv.app.game

class AnimationManager {

    private var animationSpeed = 300L

    fun getAnimationSpeed(): Long {
        return animationSpeed
    }

    fun setAnimationSpeed(speed: Long) {
        animationSpeed = speed
    }

    fun playSwapAnimation(
        fromRow: Int,
        fromCol: Int,
        toRow: Int,
        toCol: Int
    ) {
        println(
            "Swap Animation: ($fromRow,$fromCol) -> ($toRow,$toCol)"
        )
    }

    fun playMatchAnimation(
        matchedTiles: List<Pair<Int, Int>>
    ) {
        println(
            "Matched Tiles: ${matchedTiles.size}"
        )
    }

    fun playDropAnimation() {
        println("Candies Dropping...")
    }

    fun playLevelCompleteAnimation() {
        println("🎉 Level Complete!")
    }

    fun playGameOverAnimation() {
        println("💥 Game Over!")
    }

    fun reset() {
        animationSpeed = 300L
    }
}
