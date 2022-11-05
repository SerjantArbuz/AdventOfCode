package sgtmelon.adventofcode.year15.day5

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceStringUseCase

class NiceStringViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val isNiceString: IsNiceStringUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {

        var niceCount = 0
        for (string in splitText(input)) {
            if (isNiceString(string)) {
                niceCount++
            }
        }

        firstValue.postValue(niceCount.toString())
    }
}