package sgtmelon.adventofcode.year15.day3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.utils.launchBack
import sgtmelon.adventofcode.year15.day3.model.Direction
import sgtmelon.adventofcode.year15.day3.useCase.GetUniqueHousesUseCase

class SantaDirectionViewModelImpl(
    private val input: String,
    private val getUniqueHouses: GetUniqueHousesUseCase
) : ViewModel(),
    SantaDirectionViewModel {

    init {
        viewModelScope.launchBack {
            uniqueHouses.postValue(getUniqueHouses(input).size)
            calculateWorkWithRobot()
        }
    }

    override val uniqueHouses: MutableLiveData<Int> = MutableLiveData()

    override val workWithRobot: MutableLiveData<Int> = MutableLiveData()

    private fun calculateWorkWithRobot() {
        var x1 = 0
        var y1 = 0
        var x2 = 0
        var y2 = 0

        fun getKey(isSanta: Boolean): String = if (isSanta) "$x1/$y1" else "$x2/$y2"

        val coordinatesMap = hashMapOf<String, Int>()
        coordinatesMap[getKey(isSanta = true)] = 2

        for ((i, char) in input.toCharArray().withIndex()) {
            val isSanta = i % 2 == 1

            when (Direction[char]) {
                Direction.North -> if (isSanta) y1 += 1 else y2 += 1
                Direction.South -> if (isSanta) y1 -= 1 else y2 -= 1
                Direction.East -> if (isSanta) x1 += 1 else x2 += 1
                Direction.West -> if (isSanta) x1 -= 1 else x2 -= 1
            }

            val presentCount = coordinatesMap[getKey(isSanta)] ?: 0
            coordinatesMap[getKey(isSanta)] = presentCount + 1
        }

        workWithRobot.postValue(coordinatesMap.size)
    }
}