package sgtmelon.adventofcode.year15.day5

import android.util.Log
import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString1UseCase
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString2UseCase

class NiceStringViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val isNiceString1: IsNiceString1UseCase,
    private val isNiceString2: IsNiceString2UseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        var nice1Count = 0
        var nice2Count = 0

        Log.i("HERE", "isNice: ${isNiceString2("rxexcbwhiywwwwnu")}")

        for ((i, string) in splitText(input).withIndex()) {
            if (isNiceString1(string)) {
                nice1Count++
            }

            Log.i("HERE", "$i | line: $string")
            if (isNiceString2(string)) {
                nice2Count++
            }
        }

        firstValue.postValue(nice1Count.toString())
        secondValue.postValue(nice2Count.toString())
    }
}