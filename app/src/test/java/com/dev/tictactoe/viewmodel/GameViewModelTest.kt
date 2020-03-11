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
}