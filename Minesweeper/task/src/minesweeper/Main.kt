package minesweeper

import java.util.*
import kotlin.math.sign
import kotlin.random.Random

val scanner = Scanner(System.`in`)

val mineField = Array(9) { Array(9) { zero } }

const val mine = "X"
const val zero = "."
var x = 0
var y = 0


fun main() {
    println("How many mines do you want on the field?")
    setMinesOnField()
    showNumberMinesAroundCells()
    showMinefield()
}

fun showMinefield() {
    for (row in mineField) {
        for (cell in row) {
            print(cell)
        }
        println()
    }
}

fun setMinesOnField() {
    val mineCount = scanner.nextInt()
    var counter = 0

    while (counter < mineCount) {
        x = (0..8).random()
        y = (0..8).random()
        if (mineField[x][y].contains(zero)) {
            mineField[x][y] = mine
        } else if (mineField[x][y].contains(mine)) {
            x = Random.nextInt(0, 8)
            y = Random.nextInt(0, 8)
            if (mineField[x][y].contains(zero)) {
                mineField[x][y] = mine
            } else if (mineField[x][y].contains(mine)) {
                x = Random.nextInt(0, 8)
                y = Random.nextInt(0, 8)
                if (mineField[x][y].contains(zero)) {
                    mineField[x][y] = mine
                } else if (mineField[x][y].contains(mine)) {
                    x = Random.nextInt(0, 8)
                    y = Random.nextInt(0, 8)
                    if (mineField[x][y].contains(zero)) {
                        mineField[x][y] = mine
                    } else if (mineField[x][y].contains(mine)) {
                        x = Random.nextInt(0, 8)
                        y = Random.nextInt(0, 8)
                        if (mineField[x][y].contains(zero)) {
                            mineField[x][y] = mine
                        } else if (mineField[x][y].contains(mine)) {
                            x = Random.nextInt(0, 8)
                            y = Random.nextInt(0, 8)
                            if (mineField[x][y].contains(zero)) {
                                mineField[x][y] = mine
                            } else if (mineField[x][y].contains(mine)) {
                                x = Random.nextInt(0, 8)
                                y = Random.nextInt(0, 8)
                                if (mineField[x][y].contains(zero)) {
                                    mineField[x][y] = mine
                                } else if (mineField[x][y].contains(mine)) {
                                    x = Random.nextInt(0, 8)
                                    y = Random.nextInt(0, 8)
                                    if (mineField[x][y].contains(zero)) {
                                        mineField[x][y] = mine
                                    } else if (mineField[x][y].contains(mine)) {
                                        x = Random.nextInt(0, 8)
                                        y = Random.nextInt(0, 8)
                                        if (mineField[x][y].contains(zero)) {
                                            mineField[x][y] = mine
                                        } else if (mineField[x][y].contains(mine)) {
                                            x = Random.nextInt(0, 8)
                                            y = Random.nextInt(0, 8)
                                            mineField[x][y] = mine
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        counter++
    }
}

fun showNumberMinesAroundCells() {

    for (i in mineField.indices) {
        for (j in mineField.indices) {

            if (mineField[i][j].contains(mine)) {

                val iMin = i - 1
                val iPlus = i + 1
                val jMin = j - 1
                val jPlus = j + 1

                for (xCoordinator in iMin..iPlus) {
                    for (yCoordinator in jMin..jPlus) {

                        if (xCoordinator < 0 || xCoordinator >= mineField.size || yCoordinator < 0 || yCoordinator >= mineField.size) continue
                        if (mineField[xCoordinator][yCoordinator].contains(mine)) continue

                        if (mineField[xCoordinator][yCoordinator] in "1".."8") {
                            val valueCell = mineField[xCoordinator][yCoordinator]
                            val valueCellIncrement = valueCell.toInt() + 1
                            mineField[xCoordinator][yCoordinator] = valueCellIncrement.toString()
                        } else {
                            mineField[xCoordinator][yCoordinator] = "1"
                        }
                    }
                }
            }
        }
    }
}