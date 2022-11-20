package sgtmelon.adventofcode.staff.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.menu.model.Year
import sgtmelon.adventofcode.staff.menu.useCase.GetYearsUseCase
import sgtmelon.adventofcode.staff.utils.launchBack

class MainMenuViewModelImpl(
    private val getYears: GetYearsUseCase
) : ViewModel(),
    MainMenuViewModel {

    init {
        viewModelScope.launchBack { yearList.postValue(getYears()) }
    }

    override val yearList: MutableLiveData<List<Year>> = MutableLiveData()

}