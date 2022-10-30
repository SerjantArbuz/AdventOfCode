package sgtmelon.adventofcode.menu.useCase

import sgtmelon.adventofcode.menu.model.Day
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.menu.model.Solution
import sgtmelon.adventofcode.year21.day10.SubmarineActivity

class GetYearsUseCase {

    private val solvedList: List<Pair<Int, Day>> = listOf(
        2021 to Day(i = 10, Solution.FULL, SubmarineActivity::class.java)
    )

    private var yearList: List<Year>? = null

    operator fun invoke(): List<Year> = yearList ?: run {
        val list = mutableListOf<Year>()

        for (year in (MIN_YEAR..MAX_YEAR)) {
            val dayList = mutableListOf<Day>()

            for (day in (MIN_DAY..MAX_DAY)) {
                val index = solvedList.indexOfFirst { it.first == year && it.second.i == day }
                val solvedDay = solvedList.getOrNull(index)?.second
                dayList.add(solvedDay ?: Day(i = day))
            }

            list.add(Year(i = year, dayList))
        }

        yearList = list

        return list
    }

    operator fun invoke(year: Int): Year? = invoke().firstOrNull { it.i == year }

    companion object {
        const val MIN_YEAR = 2015
        const val MAX_YEAR = 2022
        const val MIN_DAY = 1
        const val MAX_DAY = 25
    }
}