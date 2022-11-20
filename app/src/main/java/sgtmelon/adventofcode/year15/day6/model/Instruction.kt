package sgtmelon.adventofcode.year15.day6.model

data class Instruction(val command: Command, val start: Pair<Int, Int>, val end: Pair<Int, Int>)