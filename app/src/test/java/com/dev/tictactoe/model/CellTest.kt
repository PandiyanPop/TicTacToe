package com.dev.tictactoe.model

import org.junit.Assert
import org.junit.Test

class CellTest {

    private val playerOne = "John"
    private val playerTwo = "Harry"
    private val playerOneValue = Board.PLAYER_ONE_VALUE
    private val playerTwoValue = Board.PLAYER_TWO_VALUE
    private val player1 = Player(playerOne, playerOneValue)
    private val player2 = Player(playerTwo, playerTwoValue)

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

    @Test
    fun `Given function should return expected value, when player value is not null or not empty in the cell`(){
        val actualResult = cell.isEmptyCell
        Assert.assertTrue(!actualResult)
    }

    @Test
    fun `Given function should return false when cell is empty`(){
        val actualResult = cell.hasCellValuesAreEqual()
        Assert.assertFalse(actualResult)
    }

    @Test
    fun `Given function should return false, when player value is not available`(){

        val player = Player(playerOne, "")
        val cell = Cell(player)

        val actualResult = cell.hasCellValuesAreEqual(cell)

        Assert.assertEquals(false, actualResult)
    }

    @Test
    fun `Given function should return false when player values are not equal in the cells`(){

        val cellOne = Cell(player1)
        val cellTwo = Cell(player2)

        val actualResult = cell.hasCellValuesAreEqual(cellOne, cellTwo)

        Assert.assertEquals(false, actualResult)
    }
}