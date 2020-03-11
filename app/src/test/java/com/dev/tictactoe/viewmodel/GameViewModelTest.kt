package com.dev.tictactoe.viewmodel

import com.dev.tictactoe.model.Board
import org.junit.Assert
import org.junit.Test

class GameViewModelTest {

    private val viewModel = GameViewModel()
    private val playerOne = "John"
    private val playerTwo = "Harry"
    private val playerOneValue = Board.PLAYER_ONE_VALUE
    private val ROW_INDEX = 0
    private val COLUMN_INDEX = 0

    @Test
    fun `Given function should return player one name`(){
        val expectedResult = playerOne

        viewModel.init(playerOne, playerTwo)

        val actualResult = viewModel.board.player1.name

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should return expected result`(){

        viewModel.init(playerOne, playerTwo)

        val actualResult = viewModel.cells

        Assert.assertNotNull(actualResult)
    }

    @Test
    fun `Given function should return expected result, when 0,0 column clicked in the game`(){

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(ROW_INDEX,COLUMN_INDEX)

        val actualResult =  viewModel.board.cells[ROW_INDEX][COLUMN_INDEX].player?.name

        Assert.assertEquals(playerOne, actualResult)
    }

    @Test
    fun `Given function should return String of given numbers`(){

        val actualResult = viewModel.stringFromNumbers(0,1)

        Assert.assertEquals("01", actualResult)
    }

    @Test
    fun `Given function should return player one value, when 0,0 column clicked in the game`(){

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(ROW_INDEX,COLUMN_INDEX)

        val actualResult =  viewModel.cells[viewModel.stringFromNumbers(ROW_INDEX, COLUMN_INDEX)]

        Assert.assertEquals(playerOneValue, actualResult)
    }
}