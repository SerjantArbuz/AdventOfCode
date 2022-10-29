package sgtmelon.adventofcode2021_10

import androidx.lifecycle.LiveData

interface SolutionViewModel {

    val corruptedPoints: LiveData<Int>

    val incompletePoints: LiveData<Int>
}