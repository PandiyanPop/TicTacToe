package com.dev.tictactoe.model

class Board(var playerOne: String, var playerTwo: String) {

    val player1 =  Player(playerOne,  PLAYER_ONE_VALUE)
    val player2 = Player(playerTwo, PLAYER_TWO_VALUE)
    var currentPlayer = player1
    var cells = Array(BOARD_SIZE) { Array(BOARD_SIZE) { Cell(null) } }
    val cell = Cell(currentPlayer)

    companion object {
        const val PLAYER_ONE_VALUE = "X"
        const val PLAYER_TWO_VALUE = "O"
        const val BOARD_SIZE = 3
    }

    fun isWinnerAvailable(): Boolean {
        for (index in 0 until BOARD_SIZE)
            if (cell.getHorizontalCells(cells, index))
                return true
        for (index in 0 until BOARD_SIZE)
            if (cell.getVerticalCells(cells, index))
                return true
        return false
    }

    fun switchPlayer() = when (currentPlayer) { player1 -> currentPlayer = player2 else -> currentPlayer = player1 }
}