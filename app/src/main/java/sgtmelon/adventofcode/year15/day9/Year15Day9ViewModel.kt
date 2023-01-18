package sgtmelon.adventofcode.year15.day9

import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl

class Year15Day9ViewModel(
    private val input: String
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        firstValue.postValue("1")
        secondValue.postValue("2")
    }
}