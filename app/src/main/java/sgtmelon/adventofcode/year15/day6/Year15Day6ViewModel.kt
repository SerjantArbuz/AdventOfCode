package sgtmelon.adventofcode.year15.day6

import sgtmelon.adventofcode.app.common.SplitTextUseCase
import sgtmelon.adventofcode.app.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day6.useCase.ApplyInstructionUseCase
import sgtmelon.adventofcode.year15.day6.useCase.GetInstructionUseCase

class Year15Day6ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getInstruction: GetInstructionUseCase,
    private val applyInstruction: ApplyInstructionUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val gridArray = Array(COLUMN_COUNT) { Array(ROW_COUNT) { false to 0 } }

        for (line in splitText(input)) {
            applyInstruction(gridArray, getInstruction(line))
        }

        with(gridArray) {
            firstValue.postValue(sumOf { row -> row.count { it.first } }.toString())
            secondValue.postValue(sumOf { row -> row.sumOf { it.second } }.toString())
        }
    }

    companion object {
        const val COLUMN_COUNT = 1000
        const val ROW_COUNT = 1000
    }
}