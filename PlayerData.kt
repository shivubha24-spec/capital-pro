package com.crushshiv.app.data

data class PlayerData(
    var playerName: String = "Player",
    var currentLevel: Int = 1,
    var score: Int = 0,
    var coins: Int = 100,
    var diamonds: Int = 50,
    var lives: Int = 5,
    var stars: Int = 0,
    var premium: Boolean = false
)
