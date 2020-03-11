package com.dev.tictactoe.model

import org.junit.Assert
import org.junit.Test

class PlayerTest {
    private val playerName = "John"
    private val player1 = Player(playerName)

    @Test
    fun `Given function should return expected result, when player names are equal`(){

        val actualResult = player1.name

        Assert.assertEquals(playerName, actualResult)
    }
}