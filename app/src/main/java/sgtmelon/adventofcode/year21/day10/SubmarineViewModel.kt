package sgtmelon.adventofcode.year21.day10

import androidx.lifecycle.LiveData

interface SubmarineViewModel {

    val corruptedPoints: LiveData<Int>

    val incompletePoints: LiveData<Long>
}