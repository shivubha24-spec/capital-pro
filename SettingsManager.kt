package com.crushshiv.app.data

data class GameSettings(
    var musicEnabled: Boolean = true,
    var soundEnabled: Boolean = true,
    var vibrationEnabled: Boolean = true,
    var notificationsEnabled: Boolean = true,
    var darkModeEnabled: Boolean = false,
    var language: String = "English"
)

class SettingsManager {

    private var settings = GameSettings()

    fun getSettings(): GameSettings {
        return settings
    }

    fun setMusic(enabled: Boolean) {
        settings.musicEnabled = enabled
    }

    fun setSound(enabled: Boolean) {
        settings.soundEnabled = enabled
    }

    fun setVibration(enabled: Boolean) {
        settings.vibrationEnabled = enabled
    }

    fun setNotifications(enabled: Boolean) {
        settings.notificationsEnabled = enabled
    }

    fun setDarkMode(enabled: Boolean) {
        settings.darkModeEnabled = enabled
    }

    fun setLanguage(language: String) {
        settings.language = language
    }

    fun reset() {
        settings = GameSettings()
    }
}
