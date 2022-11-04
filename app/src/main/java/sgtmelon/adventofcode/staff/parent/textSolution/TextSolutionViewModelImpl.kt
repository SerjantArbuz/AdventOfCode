package sgtmelon.adventofcode.staff.parent.textSolution

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.utils.launchBack

abstract class TextSolutionViewModelImpl : ViewModel(),
    TextSolutionViewModel {

    override val firstValue: MutableLiveData<String> = MutableLiveData()

    override val secondValue: MutableLiveData<String> = MutableLiveData()

    init {
        viewModelScope.launchBack { calculatePuzzle() }
    }

    abstract suspend fun calculatePuzzle()

}