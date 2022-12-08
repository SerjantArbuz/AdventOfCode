package sgtmelon.adventofcode.year15.day6.useCase

import sgtmelon.adventofcode.app.presentation.model.exception.WrongInputCharException
import sgtmelon.adventofcode.year15.day6.model.Command
import sgtmelon.adventofcode.year15.day6.model.Instruction

class GetInstructionUseCase {

    operator fun invoke(text: String): Instruction {
        val command = Command.values().firstOrNull { text.startsWith(it.value) }
            ?: throw WrongInputCharException(text)

        val (start, end) = parseCoordinates(text, command)

        return Instruction(command, start, end)
    }

    private fun parseCoordinates(
        text: String,
        command: Command
    ): Pair<Pair<Int, Int>, Pair<Int, Int>> {
        val coordinateList = text.replace("${command.value} ", "")
            .split(" through ")

        fun getPair(coordinate: String): Pair<Int, Int> = with(coordinate) {
            return substringBefore(',').toInt() to substringAfter(',').toInt()
        }

        return getPair(coordinateList[0]) to getPair(coordinateList[1])
    }
}