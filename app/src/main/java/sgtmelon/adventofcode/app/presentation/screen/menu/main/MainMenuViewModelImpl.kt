package sgtmelon.adventofcode.app.presentation.screen.menu.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.app.domain.GetYearsUseCase
import sgtmelon.adventofcode.app.presentation.model.Year
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