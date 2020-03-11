package com.dev.tictactoe.model

class Board(var playerOne: String, var playerTwo: String) {

    val player1 =  Player(playerOne,  PLAYER_ONE_VALUE)
    val player2 = Player(playerTwo, PLAYER_TWO_VALUE)
    var currentPlayer = player1

    companion object {
        const val PLAYER_ONE_VALUE = "X"
        const val PLAYER_TWO_VALUE = "O"
    }

    fun isWinnerAvailable(): Boolean {
        return false
    }

    fun switchPlayer() = when (currentPlayer) { player1 -> currentPlayer = player2 else -> currentPlayer = player1 }
}