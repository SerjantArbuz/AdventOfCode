package sgtmelon.adventofcode.app.parent.solution

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sgtmelon.adventofcode.app.utils.launchBack

abstract class TextSolutionViewModelImpl : ViewModel(),
    TextSolutionViewModel {

    override val loading: MutableLiveData<Boolean> = MutableLiveData(true)

    override var startTime: Long = 0

    override var endTime: Long = 0

    override val spendTime: MutableLiveData<Long> = MutableLiveData()

    override val firstValue: MutableLiveData<String> = MutableLiveData()

    override val secondValue: MutableLiveData<String> = MutableLiveData()

    init {
        viewModelScope.launchBack {
            startTime = getTime()
            try {
                calculatePuzzle()
            } catch (e: Throwable) {
                e.printStackTrace()
            }
            endTime = getTime()

            loading.postValue(false)
            spendTime.postValue(endTime - startTime)
        }
    }

    abstract suspend fun calculatePuzzle()

}