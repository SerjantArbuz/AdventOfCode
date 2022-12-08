package sgtmelon.adventofcode.year15.day7

import sgtmelon.adventofcode.app.common.SplitTextUseCase
import sgtmelon.adventofcode.app.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day7.model.Command
import sgtmelon.adventofcode.year15.day7.useCase.CalculateWiresUseCase
import sgtmelon.adventofcode.year15.day7.useCase.GetCommandUseCase

class Year15Day7ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getCommand: GetCommandUseCase,
    private val calculateWires: CalculateWiresUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val commandList = splitText(input).map { getCommand(it) }

        val firstResult = calculateWires(commandList)
        firstValue.postValue(firstResult.aValue())

        val secondResult = calculateWires(getSecondCommandList(commandList, firstResult.aValue()))
        secondValue.postValue(secondResult.aValue())
    }

    private fun getSecondCommandList(
        commandList: List<Command>,
        firstResult: String
    ): List<Command> {
        val newCommandList = commandList.toMutableList()
        val bIndex = newCommandList.indexOfFirst { it is Command.Set && it.to == "b" }
        newCommandList[bIndex] = Command.Set(firstResult, to = "b")
        return newCommandList
    }

    private fun Map<String, Int>.aValue(): String {
        return this["a"]?.toString() ?: throw NullPointerException("Didn't found `a` value!")
    }
}