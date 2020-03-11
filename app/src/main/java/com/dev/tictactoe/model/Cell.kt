package com.dev.tictactoe.model

class Cell(var player: Player?){
    val isEmptyCell = player == null || player?.value.isNullOrEmpty()
}