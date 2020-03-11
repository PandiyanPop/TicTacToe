package com.dev.tictactoe.viewmodel

import androidx.databinding.ObservableArrayMap
import com.dev.tictactoe.model.Board
import com.dev.tictactoe.model.Cell

class GameViewModel {

    lateinit var board: Board
    lateinit var cells: ObservableArrayMap<String, String>

    fun init(playerOne: String, playerTwo: String){
        board = Board(playerOne, playerTwo)
        cells = ObservableArrayMap()
    }

    fun onClickedCellAt(row: Int, column: Int) {
        if (board.cells[row][column].isEmptyCell) {
            board.cells[row][column] = Cell(board.currentPlayer)
        }
    }

    fun stringFromNumbers(vararg numbers: Int): String {
        val sNumbers = StringBuilder()
        for (number in numbers)
            sNumbers.append(number)
        return sNumbers.toString()
    }
}