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

    @Test
    fun `Given function should return true, when player values are equals in the cells`(){

        val cellOne = Cell(player1)
        val cellTwo = Cell(player1)

        val actualResult = cell.hasCellValuesAreEqual(cellOne, cellTwo)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, when player has same value in horizontal cells at row 1`(){

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[0][0] = cell
        cells[0][1] = cell
        cells[0][2] = cell
        val actualResult = cell.getHorizontalCells(cells, 0)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, when player has same value in horizontal cells at row 2`(){

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[1][0] = cell
        cells[1][1] = cell
        cells[1][2] = cell
        val actualResult = cell.getHorizontalCells(cells, 1)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, when player has same value in horizontal cells at row 3`(){

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[2][0] = cell
        cells[2][1] = cell
        cells[2][2] = cell
        val actualResult = cell.getHorizontalCells(cells, 2)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, when player has same value in vertical cells at column 1`(){

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[0][0] = cell
        cells[1][0] = cell
        cells[2][0] = cell
        val actualResult = cell.getVerticalCells(cells, 0)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, when player has same value in vertical cells at column 2`(){

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[0][1] = cell
        cells[1][1] = cell
        cells[2][1] = cell
        val actualResult = cell.getVerticalCells(cells, 1)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, when player has same value in vertical cells at column 3`(){

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[0][2] = cell
        cells[1][2] = cell
        cells[2][2] = cell
        val actualResult = cell.getVerticalCells(cells, 2)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, if it has three same Diagonal cells from Left`() {

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[0][0] = cell
        cells[1][1] = cell
        cells[2][2] = cell
        val actualResult = cell.getDiagonalCellsFromLeftToRight(cells)

        Assert.assertTrue(actualResult)
    }

    @Test
    fun `Given function should return expected result, if it has three same Diagonal cells from Right`() {

        val cell = Cell(player1)
        val cells = Array(3) { Array(3) { Cell(null) } }
        cells[0][2] = cell
        cells[1][1] = cell
        cells[2][0] = cell
        val actualResult = cell.getDiagonalFromRightToLeft(cells)

        Assert.assertTrue(actualResult)
    }
}