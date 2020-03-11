package com.dev.tictactoe.viewmodel

import androidx.databinding.ObservableArrayMap
import androidx.lifecycle.ViewModel
import com.dev.tictactoe.model.Board
import com.dev.tictactoe.model.Cell
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class GameViewModel: ViewModel() {

    lateinit var board: Board
    lateinit var cells: ObservableArrayMap<String, String>
    private lateinit var playerOne: String
    private lateinit var playerTwo: String
    private var winner = MutableLiveData<String>()
    private var noWinner = MutableLiveData<String>()

    fun init(playerOne: String, playerTwo: String){
        this.playerOne = playerOne
        this.playerTwo = playerTwo
        board = Board(playerOne, playerTwo)
        cells = ObservableArrayMap()
    }

    fun getWinner(): LiveData<String> = winner
    fun getNoWinner(): LiveData<String> = noWinner

    fun onClickedCellAt(row: Int, column: Int) {
        if (board.cells[row][column].isEmptyCell) {
            board.cells[row][column] = Cell(board.currentPlayer)
            cells[stringFromNumbers(row, column)] = board.currentPlayer.value
            updateGameStatus()
        }
    }

    fun updateGameStatus() {
        if(board.isWinnerAvailable())
            winner.postValue(board.currentPlayer.name)
        else if(board.isFull())
            noWinner.postValue("No winner found!")
        else
            board.switchPlayer()
    }

    fun stringFromNumbers(vararg numbers: Int): String {
        val sNumbers = StringBuilder()
        for (number in numbers)
            sNumbers.append(number)
        return sNumbers.toString()
    }

    fun resetGame(){
        init(playerOne, playerTwo)
        winner = MutableLiveData()
    }
}