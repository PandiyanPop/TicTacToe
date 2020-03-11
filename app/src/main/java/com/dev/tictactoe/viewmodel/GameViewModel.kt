package com.dev.tictactoe.viewmodel

import com.dev.tictactoe.model.Board

class GameViewModel {

    lateinit var board: Board

    fun init(playerOne: String, playerTwo: String){
        board = Board(playerOne, playerTwo)
    }
}