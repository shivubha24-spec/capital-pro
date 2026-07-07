package com.crushshiv.app.game

class GameTimer {

    private var totalTime = 120
    private var timeLeft = 120
    private var running = false

    fun start() {
        running = true
    }

    fun stop() {
        running = false
    }

    fun reset(seconds: Int = 120) {
        totalTime = seconds
        timeLeft = seconds
        running = false
    }

    fun tick() {
        if (running && timeLeft > 0) {
            timeLeft--
        }
    }

    fun getTimeLeft(): Int {
        return timeLeft
    }

    fun getTotalTime(): Int {
        return totalTime
    }

    fun isRunning(): Boolean {
        return running
    }

    fun isFinished(): Boolean {
        return timeLeft <= 0
    }

    fun addTime(seconds: Int) {
        timeLeft += seconds
    }
}
