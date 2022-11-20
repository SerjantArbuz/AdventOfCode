package sgtmelon.adventofcode.year15.day6

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl

class FireHazardViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        firstValue.postValue("hi")
    }
}