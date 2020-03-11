package com.dev.tictactoe.model

class Board(var playerOne: String, var playerTwo: String) {

    val player1 =  Player(playerOne,  PLAYER_ONE_VALUE)
    val player2 = Player(playerTwo, PLAYER_TWO_VALUE)
    val currentPlayer = player1

    companion object {
        const val PLAYER_ONE_VALUE = "X"
        const val PLAYER_TWO_VALUE = "O"
    }
}