package sgtmelon.adventofcode.year15.day1.model

sealed class Bracket(val symbol: Char) {
    object Open : Bracket(symbol = '(')
    object Close : Bracket(symbol = ')')
}