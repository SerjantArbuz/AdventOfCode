package sgtmelon.adventofcode2021_10.model

sealed class Bracket(val char: Char) {

    sealed class Open(char: Char, val closePair: Close) : Bracket(char) {
        object Round : Open(char = '(', Close.Round)
        object Square : Open(char = '[', Close.Square)
        object Curly : Open(char = '{', Close.Curly)
        object Corner : Open(char = '<', Close.Corner)
    }

    sealed class Close(
        char: Char,
        val corruptedPoint: Int,
        val incompletePoints: Int
    ) : Bracket(char) {

        object Round : Close(char = ')', corruptedPoint = 3, incompletePoints = 1)
        object Square : Close(char = ']', corruptedPoint = 57, incompletePoints = 2)
        object Curly : Close(char = '}', corruptedPoint = 1197, incompletePoints = 3)
        object Corner : Close(char = '>', corruptedPoint = 25137, incompletePoints = 4)
    }

    companion object {
        operator fun get(char: Char): Bracket = when (char) {
            Open.Round.char -> Open.Round
            Open.Square.char -> Open.Square
            Open.Curly.char -> Open.Curly
            Open.Corner.char -> Open.Corner
            Close.Round.char -> Close.Round
            Close.Square.char -> Close.Square
            Close.Curly.char -> Close.Curly
            Close.Corner.char -> Close.Corner
            else -> throw IllegalArgumentException("Something wrong with input, illegal char")
        }
    }
}