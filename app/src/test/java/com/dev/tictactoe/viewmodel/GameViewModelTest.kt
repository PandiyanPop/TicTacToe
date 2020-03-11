package com.dev.tictactoe.viewmodel

import org.junit.Assert
import org.junit.Test

class GameViewModelTest {

    private val viewModel = GameViewModel()
    private val playerOne = "John"
    private val playerTwo = "Harry"

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
        val expectedResult = playerOne

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(0,0)

        val actualResult =  viewModel.board.cells[0][0].player?.name

        Assert.assertEquals(expectedResult, actualResult)
    }
}