package sgtmelon.adventofcode.staff.parent.solution

import androidx.lifecycle.LiveData

interface TextSolutionViewModel : LoadingViewModel,
    TimingViewModel {

    val firstValue: LiveData<String>

    val secondValue: LiveData<String>

}