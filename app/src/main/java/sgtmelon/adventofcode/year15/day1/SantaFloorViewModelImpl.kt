package sgtmelon.adventofcode.year15.day1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.utils.launchBack
import sgtmelon.adventofcode.year15.day1.useCase.GetFloorUseCase

class SantaFloorViewModelImpl(
    private val input: String,
    private val getFloor: GetFloorUseCase
) : ViewModel(),
    SantaFloorViewModel {

    init {
        viewModelScope.launchBack { floor.postValue(getFloor(input)) }
    }

    override val floor: MutableLiveData<Int> = MutableLiveData()
}