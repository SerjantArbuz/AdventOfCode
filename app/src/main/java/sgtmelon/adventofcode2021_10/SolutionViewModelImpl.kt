package sgtmelon.adventofcode2021_10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import sgtmelon.adventofcode2021_10.model.LineType
import sgtmelon.adventofcode2021_10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

class SolutionViewModelImpl(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getLineType: GetLineTypeUseCase
) : ViewModel(),
    SolutionViewModel {

    init {
        viewModelScope.launch(Dispatchers.IO) { calculatePoints() }
    }

    override val firstPartPoints: MutableLiveData<Int> = MutableLiveData()

    override val secondPartPoints: MutableLiveData<Int> = MutableLiveData()

    private fun calculatePoints() {
        val lineList = splitText(input)

        var totalPoints = 0
        for (line in lineList) {
            when (val lineType = getLineType(line)) {
                is LineType.Corrupted -> totalPoints += lineType.bracket.point
                is LineType.Incomplete -> continue
            }
        }

        firstPartPoints.postValue(totalPoints)
    }
}