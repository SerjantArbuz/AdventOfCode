package sgtmelon.adventofcode.year15.day2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.common.SplitTextUseCase
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.staff.utils.launchBack
import sgtmelon.adventofcode.year15.day2.useCase.GetSquareUseCase
import sgtmelon.adventofcode.year15.day2.useCase.GetSurfaceAreaUseCase

class ElvesPaperViewModelImpl(
    private val input: String,
    private val splitText: SplitTextUseCase,
    private val getSquare: GetSquareUseCase,
    private val getSurfaceArea: GetSurfaceAreaUseCase
) : TextSolutionViewModelImpl() {

    override val firstValue: MutableLiveData<String> = MutableLiveData()

    override val secondValue: MutableLiveData<String> = MutableLiveData()

    init {
        viewModelScope.launchBack { calculatePaperAndRibbon() }
    }

    private fun calculatePaperAndRibbon() {
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