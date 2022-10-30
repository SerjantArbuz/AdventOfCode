package sgtmelon.adventofcode.year15.day2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.common.SplitTextUseCase
import sgtmelon.adventofcode.utils.launchBack
import sgtmelon.adventofcode.year15.day2.useCase.GetSquareUseCase
import sgtmelon.adventofcode.year15.day2.useCase.GetSurfaceAreaUseCase

class ElvesPaperViewModelImpl(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getSquare: GetSquareUseCase,
    private val getSurfaceArea: GetSurfaceAreaUseCase
) : ViewModel(),
    ElvesPaperViewModel {

    init {
        viewModelScope.launchBack { calculatePaperAndRibbon() }
    }

    override val paperNeeded: MutableLiveData<Long> = MutableLiveData()

    override val ribbonNeeded: MutableLiveData<Long> = MutableLiveData()

    private fun calculatePaperAndRibbon() {
        var totalPaper = 0L
        var totalRibbon = 0L

        for (measure in splitText(input)) {
            val (paper, ribbon) = getSurfaceArea(getSquare(measure))
            totalPaper += paper
            totalRibbon += ribbon
        }

        paperNeeded.postValue(totalPaper)
        ribbonNeeded.postValue(totalRibbon)
    }
}