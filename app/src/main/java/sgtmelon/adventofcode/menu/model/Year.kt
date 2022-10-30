package sgtmelon.adventofcode.menu.model

import sgtmelon.adventofcode.menu.model.key.Solution

data class Year(val i: Int, val dayList: List<Day>) {

    val isAvailable = dayList.any { it.solution != Solution.NONE }
}