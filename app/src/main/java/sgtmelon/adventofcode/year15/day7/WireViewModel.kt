package sgtmelon.adventofcode.year15.day7

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day7.useCase.CalculateWiresUseCase
import sgtmelon.adventofcode.year15.day7.useCase.GetCommandUseCase

class WireViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getCommand: GetCommandUseCase,
    private val calculateWires: CalculateWiresUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val commandList = splitText(input).map { getCommand(it) }
        val resultMap = calculateWires(commandList)

        firstValue.postValue("a = ${resultMap["a"]}")
    }
}