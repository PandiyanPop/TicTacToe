package com.dev.tictactoe.model

import org.junit.Assert
import org.junit.Test

class BoardTest {
    private val playerOne = "John"
    private val playerTwo = "Harry"
    private val board = Board(playerOne, playerTwo)

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
}