package com.crushshiv.app.notification

class NotificationManager {

    private var notificationEnabled = true


    fun sendDailyRewardNotification() {

        if (notificationEnabled) {
            println("🎁 Your Daily Reward is Ready!")
        }
    }


    fun sendLevelCompleteNotification(level: Int) {

        if (notificationEnabled) {
            println("🏆 Level $level Completed!")
        }
    }


    fun sendPremiumNotification() {

        if (notificationEnabled) {
            println("👑 Premium Benefits Activated!")
        }
    }


    fun enableNotifications() {
        notificationEnabled = true
    }


    fun disableNotifications() {
        notificationEnabled = false
    }


    fun isEnabled(): Boolean {
        return notificationEnabled
    }
}
