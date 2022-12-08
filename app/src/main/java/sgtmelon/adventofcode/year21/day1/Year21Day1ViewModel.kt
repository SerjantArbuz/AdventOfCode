package sgtmelon.adventofcode.year21.day1

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year21.day1.useCase.CalculateChangesUseCase

class Year21Day1ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val calculateChanges: CalculateChangesUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val (singleSequence, tripleSequence) = calculateChanges(splitText(input))

        firstValue.postValue(singleSequence.toString())
        secondValue.postValue(tripleSequence.toString())
    }
}