package sgtmelon.adventofcode.year15.day5

import sgtmelon.adventofcode.app.common.SplitTextUseCase
import sgtmelon.adventofcode.app.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString1UseCase
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString2UseCase

class Year15Day5ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val isNiceString1: IsNiceString1UseCase,
    private val isNiceString2: IsNiceString2UseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        var nice1Count = 0
        var nice2Count = 0

        for (string in splitText(input)) {
            if (isNiceString1(string)) nice1Count++
            if (isNiceString2(string)) nice2Count++
        }

        firstValue.postValue(nice1Count.toString())
        secondValue.postValue(nice2Count.toString())
    }
}