package sgtmelon.adventofcode.app.blank

import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl

class BlankViewModel(
    private val input: String
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        firstValue.postValue(TODO())
        secondValue.postValue(TODO())
    }
}