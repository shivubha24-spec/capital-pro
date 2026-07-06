package com.crushshiv.app.game

class DiamondManager {

    private var diamonds = 50

    fun getDiamonds(): Int {
        return diamonds
    }

    fun addDiamonds(amount: Int) {
        if (amount > 0) {
            diamonds += amount
        }
    }

    fun spendDiamonds(amount: Int): Boolean {
        return if (amount > 0 && diamonds >= amount) {
            diamonds -= amount
            true
        } else {
            false
        }
    }

    fun resetDiamonds() {
        diamonds = 50
    }

    fun hasEnough(amount: Int): Boolean {
        return diamonds >= amount
    }
}
