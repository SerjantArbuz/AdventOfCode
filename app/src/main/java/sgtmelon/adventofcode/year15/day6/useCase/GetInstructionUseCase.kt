package sgtmelon.adventofcode.year15.day6.useCase

import sgtmelon.adventofcode.staff.model.exception.WrongInputCharException
import sgtmelon.adventofcode.staff.model.exception.WrongParseException
import sgtmelon.adventofcode.year15.day6.model.Command
import sgtmelon.adventofcode.year15.day6.model.Instruction

class GetInstructionUseCase {

    operator fun invoke(text: String): Instruction {
        val command = Command.values().firstOrNull {
            text.startsWith(it.value)
        } ?: throw WrongInputCharException(text)

        val (start, end) = try {
            parseCoordinates(text, command)
        } catch (e: Throwable) {
            throw WrongParseException(e)
        }

        return Instruction(command, start, end)
    }

    private fun parseCoordinates(
        text: String,
        command: Command
    ): Pair<Pair<Int, Int>, Pair<Int, Int>> {
        val coordinateList = text.replace("${command.value} ", "")
            .replace(" through ", "/")
            .split("/")

        fun getPair(coordinate: String): Pair<Int, Int> = with(coordinate) {
            return substringBefore(',').toInt() to substringAfter(',').toInt()
        }

        return getPair(coordinateList[0]) to getPair(coordinateList[1])
    }
}