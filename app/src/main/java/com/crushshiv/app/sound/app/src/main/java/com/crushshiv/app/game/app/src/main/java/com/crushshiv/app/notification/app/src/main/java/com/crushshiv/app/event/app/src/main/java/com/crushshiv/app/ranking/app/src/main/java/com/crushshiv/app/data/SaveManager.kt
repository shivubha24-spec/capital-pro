package com.crushshiv.app.data

import android.content.Context

class SaveManager(
    private val context: Context
) {

    private val prefs =
        context.getSharedPreferences(
            "crush_shiv_save",
            Context.MODE_PRIVATE
        )


    fun saveLevel(level: Int) {
        prefs.edit()
            .putInt("level", level)
            .apply()
    }


    fun getLevel(): Int {
        return prefs.getInt("level", 1)
    }


    fun saveCoins(coins: Int) {
        prefs.edit()
            .putInt("coins", coins)
            .apply()
    }


    fun getCoins(): Int {
        return prefs.getInt("coins", 100)
    }


    fun saveDiamonds(diamonds: Int) {
        prefs.edit()
            .putInt("diamonds", diamonds)
            .apply()
    }


    fun getDiamonds(): Int {
        return prefs.getInt("diamonds", 50)
    }


    fun savePremium(status: Boolean) {
        prefs.edit()
            .putBoolean("premium", status)
            .apply()
    }


    fun isPremium(): Boolean {
        return prefs.getBoolean("premium", false)
    }


    fun clearData() {
        prefs.edit().clear().apply()
    }
}
