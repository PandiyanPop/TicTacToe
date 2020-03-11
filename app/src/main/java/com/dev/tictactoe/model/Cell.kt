package com.dev.tictactoe.model

class Cell(var player: Player?){
    val isEmptyCell = player == null || player?.value.isNullOrEmpty()

    fun hasCellValuesAreEqual(vararg cells: Cell): Boolean {
        if (cells.isEmpty()) return false
        for (cell in cells)
            if (cell.player?.value.isNullOrEmpty()) return false
        val comparisonBase = cells[0]
        for (i in 1 until cells.size)
            if (!comparisonBase.player?.value.equals(cells[i].player?.value)) return false
        return true
    }
}