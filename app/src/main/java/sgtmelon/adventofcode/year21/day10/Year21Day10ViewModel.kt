package sgtmelon.adventofcode.year21.day10

import sgtmelon.adventofcode.app.common.SplitTextUseCase
import sgtmelon.adventofcode.app.parent.solution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year21.day10.model.LineType
import sgtmelon.adventofcode.year21.day10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetMiddleValueUseCase

class Year21Day10ViewModel(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getLineType: GetLineTypeUseCase,
    private val getIncompletePoints: GetIncompletePointsUseCase,
    private val getMiddleValue: GetMiddleValueUseCase
) : TextSolutionViewModelImpl() {

    override suspend fun calculatePuzzle() {
        val lineList = splitText(input)

        var corruptedPoints = 0
        val incompleteList = mutableListOf<Long>()

        for (line in lineList) {
            when (val lineType = getLineType(line)) {
                is LineType.Corrupted -> corruptedPoints += lineType.bracket.corruptedPoint
                is LineType.Incomplete -> incompleteList.add(getIncompletePoints(lineType))
            }
        }

        firstValue.postValue(corruptedPoints.toString())
        secondValue.postValue(getMiddleValue(incompleteList).toString())
    }
}