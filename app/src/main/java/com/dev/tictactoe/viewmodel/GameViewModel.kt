package com.dev.tictactoe.viewmodel

import androidx.databinding.ObservableArrayMap
import com.dev.tictactoe.model.Board

class GameViewModel {

    lateinit var board: Board
    lateinit var cells: ObservableArrayMap<String, String>

    fun init(playerOne: String, playerTwo: String){
        board = Board(playerOne, playerTwo)
        cells = ObservableArrayMap()
    }
}