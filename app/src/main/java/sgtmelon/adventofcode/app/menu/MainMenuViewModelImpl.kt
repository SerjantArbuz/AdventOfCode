package sgtmelon.adventofcode.app.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.app.menu.model.Year
import sgtmelon.adventofcode.app.menu.useCase.GetYearsUseCase
import sgtmelon.adventofcode.app.utils.launchBack

class MainMenuViewModelImpl(
    private val getYears: GetYearsUseCase
) : ViewModel(),
    MainMenuViewModel {

    override val yearList: MutableLiveData<List<Year>> = MutableLiveData()

    init {
        viewModelScope.launchBack { yearList.postValue(getYears()) }
    }
}