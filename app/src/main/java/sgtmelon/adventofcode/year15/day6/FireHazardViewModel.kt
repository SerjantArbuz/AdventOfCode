package sgtmelon.adventofcode.year15.day6

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day6.useCase.ApplyInstructionUseCase
import sgtmelon.adventofcode.year15.day6.useCase.GetInstructionUseCase

class FireHazardViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getInstruction: GetInstructionUseCase,
    private val applyInstruction: ApplyInstructionUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val lightMap = mutableMapOf<String, Boolean>()

        for (line in splitText(input)) {
            val instruction = getInstruction(line)
            applyInstruction(instruction, lightMap)
        }

        firstValue.postValue("lightOn: ${lightMap.count { it.value }}")
    }
}