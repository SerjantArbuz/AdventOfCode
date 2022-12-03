package sgtmelon.adventofcode.year15.day7.useCase

import sgtmelon.adventofcode.year15.day7.model.Command
import sgtmelon.adventofcode.year15.day7.model.CommandPart as Part

class GetCommandUseCase {

    private val andRegex = Regex(pattern = ".*${Part.AND}.*")
    private val orRegex = Regex(pattern = ".*${Part.OR}.*")
    private val leftShiftRegex = Regex(pattern = ".*${Part.LSHIFT}.*")
    private val rightShiftRegex = Regex(pattern = ".*${Part.RSHIFT}.*")
    private val notRegex = Regex(pattern = "${Part.NOT}.*")

    operator fun invoke(text: String): Command {
        return when {
            text.matches(andRegex) -> Command.Bool.And(parseBool(text, Part.AND))
            text.matches(orRegex) -> Command.Bool.Or(parseBool(text, Part.OR))
            text.matches(leftShiftRegex) -> Command.Shift.Left(parseShift(text, Part.LSHIFT))
            text.matches(rightShiftRegex) -> Command.Shift.Right(parseShift(text, Part.RSHIFT))
            text.matches(notRegex) -> parseNot(text)
            else -> parseSet(text)
        }
    }

    private fun parseBool(text: String, command: String): Triple<String, String, String> {
        return text.replace(command, Part.ARROW)
            .split(Part.ARROW)
            .let { Triple(it.first(), it[1], it.last()) }
    }

    private fun parseShift(text: String, command: String): Triple<String, Int, String> {
        return text.replace(command, Part.ARROW)
            .split(Part.ARROW)
            .let { Triple(it.first(), it[1].toInt(), it.last()) }
    }

    private fun parseNot(text: String): Command.Not {
        return text.replace(Part.NOT, Part.EMPTY)
            .split(Part.ARROW)
            .let { Command.Not(it.first(), it.last()) }
    }

    private fun parseSet(text: String): Command.Set {
        return text.split(Part.ARROW)
            .let { Command.Set(it.first(), it.last()) }
    }
}