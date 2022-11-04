package sgtmelon.adventofcode.year15.day3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl
import sgtmelon.adventofcode.year15.day3.useCase.GetUniqueHousesUseCase
import sgtmelon.adventofcode.year15.day3.useCase.GetWithRobotHousesUseCase

class SantaDirectionViewModel(
    input: String,
    getUniqueHouses: GetUniqueHousesUseCase,
    getWithRobotHouses: GetWithRobotHousesUseCase
) : TextSolutionViewModelImpl() {

    override val firstValue: LiveData<String> =
        MutableLiveData(getUniqueHouses(input).size.toString())

    override val secondValue: LiveData<String> =
        MutableLiveData(getWithRobotHouses(input).size.toString())

}