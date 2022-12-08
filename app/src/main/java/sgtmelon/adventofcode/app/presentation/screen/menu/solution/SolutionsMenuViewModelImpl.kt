package sgtmelon.adventofcode.app.presentation.screen.menu.solution

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.app.domain.GetYearsUseCase
import sgtmelon.adventofcode.app.presentation.model.Year
import sgtmelon.adventofcode.app.utils.launchBack

class SolutionsMenuViewModelImpl(
    private val yearId: Int?,
    private val getYears: GetYearsUseCase
) : ViewModel(),
    SolutionsMenuViewModel {

    override val currentYear: MutableLiveData<Year?> = MutableLiveData()

    init {
        viewModelScope.launchBack {
            currentYear.postValue(if (yearId != null) getYears(yearId) else null)
        }
    }
}