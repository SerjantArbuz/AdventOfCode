package sgtmelon.adventofcode.year15.day4

import androidx.lifecycle.MutableLiveData
import sgtmelon.adventofcode.staff.parent.textSolution.TextSolutionViewModelImpl

class MiningViewModel : TextSolutionViewModelImpl() {

    override val firstValue: MutableLiveData<String> = MutableLiveData()

    override val secondValue: MutableLiveData<String> = MutableLiveData()
}