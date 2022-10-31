package sgtmelon.adventofcode.year15.day3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import sgtmelon.adventofcode.year15.day3.useCase.GetUniqueHousesUseCase
import sgtmelon.adventofcode.year15.day3.useCase.GetWithRobotHousesUseCase

class SantaDirectionViewModel(
    input: String,
    getUniqueHouses: GetUniqueHousesUseCase,
    getWithRobotHouses: GetWithRobotHousesUseCase
) : ViewModel() {

    val uniqueHouses: LiveData<Int> = MutableLiveData(getUniqueHouses(input).size)

    val workWithRobot: LiveData<Int> = MutableLiveData(getWithRobotHouses(input).size)

}