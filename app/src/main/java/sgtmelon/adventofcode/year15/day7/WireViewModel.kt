package sgtmelon.adventofcode.year15.day7

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day7.model.Command
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

        val firstResult = calculateWires(commandList)["a"].toString()

        val secondCommandList = commandList.toMutableList()
        val bIndex = secondCommandList.indexOfFirst { it is Command.Set && it.to == "b" }
        secondCommandList[bIndex] = Command.Set(firstResult, "b")
        val secondResult = calculateWires(secondCommandList)

        firstValue.postValue(firstResult)
        secondValue.postValue(secondResult["a"].toString())
    }
}