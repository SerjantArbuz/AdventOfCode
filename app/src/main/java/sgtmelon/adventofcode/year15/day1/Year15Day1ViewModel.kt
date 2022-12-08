package sgtmelon.adventofcode.year15.day1

import sgtmelon.adventofcode.app.presentation.screen.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day1.useCase.GetFloorAndBasementUseCase

class Year15Day1ViewModel(
    private val input: String,
    private val getFloorAndBasement: GetFloorAndBasementUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val (floor, basementPosition) = getFloorAndBasement(input)

        firstValue.postValue(floor.toString())
        secondValue.postValue(basementPosition.toString())
    }
}