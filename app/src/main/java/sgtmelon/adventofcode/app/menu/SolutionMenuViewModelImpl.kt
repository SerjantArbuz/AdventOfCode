package sgtmelon.adventofcode.app.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.app.menu.model.Year
import sgtmelon.adventofcode.app.menu.useCase.GetYearsUseCase
import sgtmelon.adventofcode.app.utils.launchBack

class SolutionMenuViewModelImpl(
    private val yearId: Int?,
    private val getYears: GetYearsUseCase
) : ViewModel(),
    SolutionMenuViewModel {

    override val currentYear: MutableLiveData<Year?> = MutableLiveData()

    init {
        viewModelScope.launchBack {
            currentYear.postValue(if (yearId != null) getYears(yearId) else null)
        }
    }
}