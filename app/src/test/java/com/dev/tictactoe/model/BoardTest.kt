package com.dev.tictactoe.model

import org.junit.Assert
import org.junit.Test

class BoardTest {
    private val playerOne = "John"
    private val playerTwo = "Harry"
    private val playerValue = Board.PLAYER_ONE_VALUE
    private val board = Board(playerOne, playerTwo)
    val player1 = Player(playerOne, playerValue)

    @Test
    fun `Given function should return expected player, when player one called`(){

        val actualResult = board.playerOne

        Assert.assertEquals(playerOne, actualResult)
    }

    @Test
    fun `Given function should return expected player, when player two called`(){

        val actualResult = board.playerTwo

        Assert.assertEquals(playerTwo, actualResult)
    }

    @Test
    fun `Given function should return expected result, player one is configured`(){

        val actualResult = board.player1.name

        Assert.assertEquals(player1.name, actualResult)
    }
}