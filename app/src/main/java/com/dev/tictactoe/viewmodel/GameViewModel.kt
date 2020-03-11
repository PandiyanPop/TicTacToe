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
        when { isCellEmpty(row, column) -> updatePlayerValueInSelectedCell(row, column) }
    }

    private fun updatePlayerValueInSelectedCell(row: Int, column: Int) {
        board.cells[row][column] = notifyCurrentPlayer()
        cells[stringFromNumbers(row, column)] = getCurrentPlayerValue()
        updateGameStatus()
    }

    fun updateGameStatus() = when {
            board.isWinnerAvailable() -> winner.postValue(board.currentPlayer.name)
            board.isFull() -> noWinner.postValue(Board.NO_WINNER_FOUND)
            else -> board.switchPlayer()
    }

    fun stringFromNumbers(vararg numbers: Int): String {
        val sNumbers = StringBuilder()
        numbers.forEach { number -> sNumbers.append(number) }
        return sNumbers.toString()
    }

    fun resetGame(){
        init(playerOne, playerTwo)
        winner = MutableLiveData()
        noWinner = MutableLiveData()
    }
    private fun isCellEmpty(row: Int, column: Int) = board.cells[row][column].isEmptyCell
    private fun notifyCurrentPlayer() = Cell(board.currentPlayer)
    private fun getCurrentPlayerValue() = board.currentPlayer.value
}