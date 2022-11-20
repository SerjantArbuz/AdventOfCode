package sgtmelon.adventofcode.staff.parent.textSolution

import androidx.lifecycle.LiveData

interface TextSolutionViewModel {

    val loading: LiveData<Boolean>

    val firstValue: LiveData<String>

    val secondValue: LiveData<String>

}