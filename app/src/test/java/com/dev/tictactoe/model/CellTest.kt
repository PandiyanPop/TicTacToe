package com.dev.tictactoe.model

import org.junit.Assert
import org.junit.Test

class CellTest {

    private val playerOne = "John"
    private val playerOneValue = Board.PLAYER_ONE_VALUE
    private val player1 = Player(playerOne, playerOneValue)
    private val cell = Cell(player1)

    @Test
    fun `Given function should return expected player name, when player one passed`(){

        val actualResult = cell.player?.name

        Assert.assertEquals(playerOne, actualResult)
    }

    @Test
    fun `Given function should return expected value, when cell is not null`(){
        val actualResult = cell.isEmptyCell
        Assert.assertFalse(actualResult)
    }
}