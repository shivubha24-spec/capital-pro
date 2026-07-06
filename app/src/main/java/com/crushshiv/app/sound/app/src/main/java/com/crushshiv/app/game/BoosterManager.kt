package com.crushshiv.app.game

class BoosterManager {

    private var hammer = 3
    private var bomb = 2
    private var colorBlast = 1


    fun getHammer(): Int {
        return hammer
    }


    fun getBomb(): Int {
        return bomb
    }


    fun getColorBlast(): Int {
        return colorBlast
    }


    fun useHammer(): Boolean {

        return if (hammer > 0) {
            hammer--
            true
        } else {
            false
        }
    }


    fun useBomb(): Boolean {

        return if (bomb > 0) {
            bomb--
            true
        } else {
            false
        }
    }


    fun useColorBlast(): Boolean {

        return if (colorBlast > 0) {
            colorBlast--
            true
        } else {
            false
        }
    }


    fun addHammer(amount: Int) {
        hammer += amount
    }


    fun addBomb(amount: Int) {
        bomb += amount
    }


    fun addColorBlast(amount: Int) {
        colorBlast += amount
    }


    fun resetBoosters() {
        hammer = 3
        bomb = 2
        colorBlast = 1
    }
}
