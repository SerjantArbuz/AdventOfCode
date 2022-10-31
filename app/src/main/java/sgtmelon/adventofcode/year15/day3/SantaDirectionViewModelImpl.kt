package sgtmelon.adventofcode.year15.day3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.staff.utils.launchBack
import sgtmelon.adventofcode.year15.day3.model.Direction

class SantaDirectionViewModelImpl(
    private val input: String
) : ViewModel(),
    SantaDirectionViewModel {

    init {
        viewModelScope.launchBack { calculateUniqueHouses() }
    }

    override val uniqueHouses: MutableLiveData<Int> = MutableLiveData()

    private fun calculateUniqueHouses() {
        var x = 0
        var y = 0

        fun getKey(): String = "$x$y"

        val coordinatesMap = hashMapOf<String, Int>()
        coordinatesMap[getKey()] = 0

        for (char in input.toCharArray()) {
            when (Direction[char]) {
                Direction.North -> y += 1
                Direction.South -> y -= 1
                Direction.East -> x += 1
                Direction.West -> x -= 1
            }

            val presentCount: Int = coordinatesMap[getKey()] ?: 0
            coordinatesMap[getKey()] = presentCount + 1
        }

        uniqueHouses.postValue(coordinatesMap.size)
    }

}