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
        viewModelScope.launchBack { calculatePaper() }
    }

    override val paperNeeded: MutableLiveData<Long> = MutableLiveData()

    private fun calculatePaper() {
        var totalSurface: Long = 0L

        for (measure in splitText(input)) {
            totalSurface += getSurfaceArea(getSquare(measure))
        }

        paperNeeded.postValue(totalSurface)
    }
}