package com.crushshiv.app.viewmodel

data class Position(
    val row: Int,
    val column: Int
)

sealed class GameAction {

    data class SelectCandy(
        val position: Position
    ) : GameAction()

    object ResetGame : GameAction()

    object NextLevel : GameAction()

    object UseHammer : GameAction()

    object ShuffleBoard : GameAction()

    object AddExtraMoves : GameAction()
}
