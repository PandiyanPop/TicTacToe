package com.dev.tictactoe.model

import org.junit.Assert
import org.junit.Test

class BoardTest {
    private val playerOne = "John"
    private val playerTwo = "Harry"
    private val playerOneValue = Board.PLAYER_ONE_VALUE
    private val playerTwoValue = Board.PLAYER_TWO_VALUE
    private val board = Board(playerOne, playerTwo)
    private val player1 = Player(playerOne, playerOneValue)
    private val player2 = Player(playerTwo, playerTwoValue)

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

    @Test
    fun `Given function should return expected result, when player two is configured`(){

        val actualResult = board.player2.name

        Assert.assertNotEquals(player1.name, actualResult)
    }

    @Test
    fun `Given function should return current player name as player one name, when game starts on first time`(){
        val expectedResult = player1.name

        val actualResult = board.currentPlayer.name

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should return player 2 when switching player, if current player is player 1`(){
        val expectedResult = player2.name

        board.switchPlayer()

        val actualResult = board.currentPlayer.name

        Assert.assertEquals(expectedResult, actualResult)
    }
}