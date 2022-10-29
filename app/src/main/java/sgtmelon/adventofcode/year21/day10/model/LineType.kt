package sgtmelon.adventofcode.year21.day10.model

sealed class LineType {

    class Corrupted(val bracket: Bracket.Close) : LineType()

    class Incomplete(val list: List<Bracket.Open>) : LineType()
}