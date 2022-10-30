package sgtmelon.adventofcode.year15.day2

import androidx.lifecycle.LiveData

interface ElvesPaperViewModel {

    val paperNeeded: LiveData<Long>

    val ribbonNeeded: LiveData<Long>
}