package sgtmelon.adventofcode.app.presentation.screen.parent.solution

import androidx.lifecycle.LiveData

interface TimingViewModel {

    val startTime: Long

    val endTime: Long

    val spendTime: LiveData<Long>

    fun getTime() = System.currentTimeMillis()

}