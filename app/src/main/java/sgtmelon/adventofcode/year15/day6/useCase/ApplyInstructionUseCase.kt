package sgtmelon.adventofcode.year15.day6.useCase

import kotlin.math.max
import sgtmelon.adventofcode.year15.day6.model.Command
import sgtmelon.adventofcode.year15.day6.model.Instruction

class ApplyInstructionUseCase {

    operator fun invoke(gridArray: Array<Array<Pair<Boolean, Int>>>, instruction: Instruction) {
        val (x1, y1) = instruction.start
        val (x2, y2) = instruction.end

        for (y in (y1..y2)) {
            for (x in (x1..x2)) {
                val (value, bright) = gridArray[x][y]

                val newValue = when (instruction.command) {
                    Command.ON -> true
                    Command.OFF -> false
                    Command.TOGGLE -> !value
                }
                val newBright = max(a = bright + instruction.command.bright, b = 0)

                gridArray[x][y] = newValue to newBright
            }
        }
    }
}