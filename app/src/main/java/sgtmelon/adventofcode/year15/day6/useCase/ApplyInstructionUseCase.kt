package sgtmelon.adventofcode.year15.day6.useCase

import kotlin.math.max
import sgtmelon.adventofcode.year15.day6.model.Command
import sgtmelon.adventofcode.year15.day6.model.Instruction

class ApplyInstructionUseCase {

    operator fun invoke(
        instruction: Instruction,
        lightMap: MutableMap<String, Boolean>,
        brightMap: MutableMap<String, Int>
    ) {
        val (x1, y1) = instruction.start
        val (x2, y2) = instruction.end

        for (i in (x1..x2)) {
            for (j in (y1..y2)) {
                val key = "$i/$j"

                lightMap[key] = when (instruction.command) {
                    Command.ON -> true
                    Command.OFF -> false
                    Command.TOGGLE -> !(lightMap[key] ?: false)
                }

                brightMap[key] = max(a = (brightMap[key] ?: 0) + instruction.command.bright, b = 0)
            }
        }
    }
}