package sgtmelon.adventofcode.year15.day1

import sgtmelon.adventofcode.staff.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day1.useCase.GetFloorAndBasementUseCase

class SantaFloorViewModel(
    private val input: String,
    private val getFloorAndBasement: GetFloorAndBasementUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val (floor, basementPosition) = getFloorAndBasement(input)

        firstValue.postValue(floor.toString())
        secondValue.postValue(basementPosition.toString())
    }
}