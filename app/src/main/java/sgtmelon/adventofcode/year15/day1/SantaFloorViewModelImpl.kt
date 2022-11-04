package sgtmelon.adventofcode.year15.day1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.staff.utils.launchBack
import sgtmelon.adventofcode.year15.day1.useCase.GetFloorAndBasementUseCase

class SantaFloorViewModelImpl(
    private val input: String,
    private val getFloorAndBasement: GetFloorAndBasementUseCase
) : TextSolutionViewModelImpl() {

    override val firstValue: MutableLiveData<String> = MutableLiveData()

    override val secondValue: MutableLiveData<String> = MutableLiveData()

    init {
        viewModelScope.launchBack {
            val (floor, basementPosition) = getFloorAndBasement(input)

            firstValue.postValue(floor.toString())
            secondValue.postValue(basementPosition.toString())
        }
    }
}