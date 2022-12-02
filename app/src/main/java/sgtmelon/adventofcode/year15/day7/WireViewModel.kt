package sgtmelon.adventofcode.year15.day7

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionViewModelImpl

class WireViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        firstValue.postValue("Hi")
    }
}