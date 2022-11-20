package sgtmelon.adventofcode.year15.day2

import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day2.useCase.GetSquareUseCase
import sgtmelon.adventofcode.year15.day2.useCase.GetSurfaceAreaUseCase

class ElvesPaperViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getSquare: GetSquareUseCase,
    private val getSurfaceArea: GetSurfaceAreaUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        var totalPaper = 0L
        var totalRibbon = 0L

        for (measure in splitText(input)) {
            val (paper, ribbon) = getSurfaceArea(getSquare(measure))
            totalPaper += paper
            totalRibbon += ribbon
        }

        firstValue.postValue(totalPaper.toString())
        secondValue.postValue(totalRibbon.toString())
    }
}