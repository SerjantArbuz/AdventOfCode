package sgtmelon.adventofcode.year15.day8

import sgtmelon.adventofcode.app.domain.SplitTextUseCase
import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl

class Year15Day8ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val list = splitText(input)

        firstValue.postValue("lineCount: ${list.size}")
        secondValue.postValue("2")
    }
}