package com.crushshiv.app.game

class CoinManager {

    private var coins = 100

    fun getCoins(): Int {
        return coins
    }

    fun addCoins(amount: Int) {
        if (amount > 0) {
            coins += amount
        }
    }

    fun spendCoins(amount: Int): Boolean {
        return if (amount > 0 && coins >= amount) {
            coins -= amount
            true
        } else {
            false
        }
    }

    fun resetCoins() {
        coins = 100
    }
}
