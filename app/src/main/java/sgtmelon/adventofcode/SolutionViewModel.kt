package sgtmelon.adventofcode

import androidx.lifecycle.LiveData

interface SolutionViewModel {

    val corruptedPoints: LiveData<Int>

    val incompletePoints: LiveData<Long>
}