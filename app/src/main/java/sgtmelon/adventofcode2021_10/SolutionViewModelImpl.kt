package sgtmelon.adventofcode2021_10

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import sgtmelon.adventofcode2021_10.model.LineType
import sgtmelon.adventofcode2021_10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode2021_10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModelImpl(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getLineType: GetLineTypeUseCase,
    private val getIncompletePoints: GetIncompletePointsUseCase
) : ViewModel(),
    SolutionViewModel {

    init {
        viewModelScope.launch(Dispatchers.IO) { calculatePoints() }
    }

    override val corruptedPoints: MutableLiveData<Int> = MutableLiveData()

    override val incompletePoints: MutableLiveData<Int> = MutableLiveData()

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

        Log.i("HERE", "incomplete:\n${incompleteList.joinToString("\n")}")

        this.corruptedPoints.postValue(corruptedPoints)
//        this.incompletePoints.postValue()
    }
}