package sgtmelon.adventofcode.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.menu.useCase.GetYearsUseCase
import sgtmelon.adventofcode.utils.launchBack

class MainMenuViewModelImpl(val getYears: GetYearsUseCase) : ViewModel(),
    MainMenuViewModel {

    init {
        viewModelScope.launchBack { yearList.postValue(getYears()) }
    }

    override val yearList: MutableLiveData<List<Year>> = MutableLiveData()

}