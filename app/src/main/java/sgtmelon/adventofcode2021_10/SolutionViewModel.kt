package sgtmelon.adventofcode2021_10

import androidx.lifecycle.LiveData

interface SolutionViewModel {

    val firstPartPoints: LiveData<Int>

    val secondPartPoints: LiveData<Int>
}