package sgtmelon.adventofcode.year21.day10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.staff.utils.launchBack
import sgtmelon.adventofcode.year21.day10.model.LineType
import sgtmelon.adventofcode.year21.day10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetMiddleValueUseCase

class SubmarineViewModelImpl(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getLineType: GetLineTypeUseCase,
    private val getIncompletePoints: GetIncompletePointsUseCase,
    private val getMiddleValue: GetMiddleValueUseCase
) : TextSolutionViewModelImpl() {

    override val firstValue: MutableLiveData<String> = MutableLiveData()

    override val secondValue: MutableLiveData<String> = MutableLiveData()

    init {
        viewModelScope.launchBack { calculatePoints() }
    }

    private fun calculatePoints() {
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