package sgtmelon.adventofcode.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.menu.model.Day
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.menu.useCase.GetYearsUseCase
import sgtmelon.adventofcode.utils.launchBack

class SolutionMenuViewModelImpl(
    private val yearId: Int?,
    private val getYears: GetYearsUseCase
) : ViewModel(),
    SolutionMenuViewModel {

    init {
        viewModelScope.launchBack {
            currentYear.postValue(if (yearId != null) getYears(yearId) else null)
        }
    }

    override val currentYear: MutableLiveData<Year?> = MutableLiveData()

}