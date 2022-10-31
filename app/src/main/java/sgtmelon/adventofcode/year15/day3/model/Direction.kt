package sgtmelon.adventofcode.year15.day3.model

import sgtmelon.adventofcode.staff.model.exception.WrongInputCharException

/**
 * north (^), south (v), east (>), or west (<)
 */
sealed class Direction(val char: Char) {

    object North : Direction(char = '^')
    object South : Direction(char = 'v')
    object East : Direction(char = '>')
    object West : Direction(char = '<')

    companion object {
        operator fun get(char: Char): Direction = when (char) {
            North.char -> North
            South.char -> South
            East.char -> East
            West.char -> West
            else -> throw WrongInputCharException()
        }
    }
}