package sgtmelon.adventofcode.menu.useCase

import sgtmelon.adventofcode.menu.model.Day
import sgtmelon.adventofcode.menu.model.Year
import sgtmelon.adventofcode.menu.model.key.Solution

class GetYearsUseCase {

    private val solvedList: List<Triple<Int, Int, Solution>> = listOf(
        Triple(first = 2021, second = 10, Solution.FULL)
    )

    private var yearList: List<Year>? = null

    operator fun invoke(): List<Year> = yearList ?: run {
        val list = mutableListOf<Year>()

        for (year in (MIN_YEAR..MAX_YEAR)) {
            val dayList = mutableListOf<Day>()

            for (day in (MIN_DAY..MAX_DAY)) {
                val index = solvedList.indexOfFirst { it.first == year && it.second == day }
                val solution = solvedList.getOrNull(index)?.third ?: Solution.NONE
                dayList.add(Day(i = day, solution))
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