package com.crushshiv.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.crushshiv.app.game.*

class GameViewModel : ViewModel() {

    private val boardGenerator = BoardGenerator()
    private val scoreManager = ScoreManager()
    private val coinManager = CoinManager()
    private val diamondManager = DiamondManager()
    private val livesManager = LivesManager()

    private val _board =
        mutableStateOf(boardGenerator.generateBoard())

    val board: State<Array<Array<CandyType>>> = _board

    private val _score = mutableStateOf(0)
    val score: State<Int> = _score

    fun resetGame() {
        _board.value = boardGenerator.generateBoard()
        scoreManager.reset()
        _score.value = scoreManager.getScore()
    }

    fun addScore(points: Int) {
        scoreManager.add(points)
        _score.value = scoreManager.getScore()
    }

    fun getCoins(): Int = coinManager.getCoins()

    fun getDiamonds(): Int = diamondManager.getDiamonds()

    fun getLives(): Int = livesManager.getLives()
}
