package sgtmelon.adventofcode.year15.day4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MiningViewModel : ViewModel() {

    val firstValue: LiveData<String> = MutableLiveData()

    val secondValue: LiveData<String> = MutableLiveData()
}