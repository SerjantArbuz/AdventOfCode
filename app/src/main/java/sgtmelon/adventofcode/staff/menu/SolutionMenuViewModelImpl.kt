package sgtmelon.adventofcode.staff.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.menu.model.Year
import sgtmelon.adventofcode.staff.menu.useCase.GetYearsUseCase
import sgtmelon.adventofcode.staff.utils.launchBack

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