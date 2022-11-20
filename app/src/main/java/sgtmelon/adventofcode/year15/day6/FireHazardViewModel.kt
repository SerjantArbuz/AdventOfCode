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
        val brightMap = mutableMapOf<String, Int>()

        for (line in splitText(input)) {
            val instruction = getInstruction(line)
            applyInstruction(instruction, lightMap, brightMap)
        }

        firstValue.postValue(lightMap.count { it.value }.toString())
        secondValue.postValue(brightMap.values.sum().toString())
    }
}