package sgtmelon.adventofcode.year15.day1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SantaFloorViewModelImpl(
    private val input: String
) : ViewModel(),
    SantaFloorViewModel {

    override val floor: MutableLiveData<Int> = MutableLiveData()
}