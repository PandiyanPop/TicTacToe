package com.dev.tictactoe.model

class Cell(var player: Player?){
    companion object {
        const val INDEX_ZERO = 0
        const val INDEX_ONE = 1
        const val INDEX_TWO = 2
    }
    val isEmptyCell = player == null || player?.value.isNullOrEmpty()

    fun getHorizontalCells(cells: Array<Array<Cell>>, index: Int) = hasCellValuesAreEqual(cells[index][INDEX_ZERO], cells[index][INDEX_ONE], cells[index][INDEX_TWO])

    fun hasCellValuesAreEqual(vararg cells: Cell): Boolean {
        if (isEmptyCell(cells)) return false
        cells.forEach { cell -> when { isPlayerValueIsEmpty(cell) -> return false } }
        val comparisonBase = cells[INDEX_ZERO]
        return (INDEX_ONE until cells.size).all { isPlayerValuesAreSame(comparisonBase, cells, it) }
    }

    private fun isPlayerValuesAreSame(comparisonBase: Cell, cells: Array<out Cell>, index: Int) = getPlayerValue(comparisonBase).equals(getPlayerValue(cells[index]))
    private fun isPlayerValueIsEmpty(cell: Cell) = getPlayerValue(cell).isNullOrEmpty()
    private fun isEmptyCell(cells: Array<out Cell>) = cells.isEmpty()
    private fun getPlayerValue(comparisonBase: Cell) = comparisonBase.player?.value
}