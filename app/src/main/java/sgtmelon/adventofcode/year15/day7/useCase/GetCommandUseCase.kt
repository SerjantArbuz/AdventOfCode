package sgtmelon.adventofcode.year15.day7.useCase

import sgtmelon.adventofcode.staff.model.exception.WrongParseException
import sgtmelon.adventofcode.year15.day7.model.Command

class GetCommandUseCase {

    private val andRegex = Regex(pattern = ".*$AND.*")
    private val orRegex = Regex(pattern = ".*$OR.*")
    private val leftShiftRegex = Regex(pattern = ".*$LSHIFT.*")
    private val rightShiftRegex = Regex(pattern = ".*$RSHIFT.*")
    private val notRegex = Regex(pattern = "$NOT.*")

    operator fun invoke(text: String): Command {
        try {
            return when {
                text.matches(andRegex) -> Command.Bool.And(parseBool(text, AND))
                text.matches(orRegex) -> Command.Bool.Or(parseBool(text, OR))
                text.matches(leftShiftRegex) -> Command.Shift.Left(parseShift(text, LSHIFT))
                text.matches(rightShiftRegex) -> Command.Shift.Right(parseShift(text, RSHIFT))
                text.matches(notRegex) -> parseNot(text)
                else -> parseSet(text)
            }
        } catch (e: Throwable) {
            throw WrongParseException(e)
        }
    }

    private fun parseBool(text: String, command: String): Triple<String, String, String> {
        return text.replace(command, ARROW)
            .split(ARROW)
            .let { Triple(it.first(), it[1], it.last()) }
    }


    private fun parseShift(text: String, command: String): Triple<String, Int, String> {
        return text.replace(command, ARROW)
            .split(ARROW)
            .let { Triple(it.first(), it[1].toInt(), it.last()) }
    }

    private fun parseNot(text: String): Command.Not {
        return text.replace(NOT, "")
            .split(ARROW)
            .let { Command.Not(it.first(), it.last()) }
    }

    private fun parseSet(text: String): Command.Set {
        return text.split(ARROW)
            .let { Command.Set(it.first(), it.last()) }
    }

    companion object {
        private const val ARROW = " -> "
        private const val AND = " AND "
        private const val OR = " OR "
        private const val LSHIFT = " LSHIFT "
        private const val RSHIFT = " RSHIFT "
        private const val NOT = "NOT "
    }
}