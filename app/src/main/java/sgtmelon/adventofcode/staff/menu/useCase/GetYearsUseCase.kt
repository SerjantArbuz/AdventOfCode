package sgtmelon.adventofcode.staff.menu.useCase

import sgtmelon.adventofcode.staff.menu.model.Day
import sgtmelon.adventofcode.staff.menu.model.Solution
import sgtmelon.adventofcode.staff.menu.model.Year
import sgtmelon.adventofcode.year15.day1.SantaFloorActivity
import sgtmelon.adventofcode.year15.day2.ElvesPaperActivity
import sgtmelon.adventofcode.year15.day3.SantaDirectionActivity
import sgtmelon.adventofcode.year15.day4.MiningActivity
import sgtmelon.adventofcode.year15.day5.NiceStringActivity
import sgtmelon.adventofcode.year15.day6.FireHazardActivity
import sgtmelon.adventofcode.year21.day10.SubmarineActivity

class GetYearsUseCase {

    private val solvedList: List<Pair<Int, Day>> = listOf(
        2015 to Day(id = 1, Solution.FULL, SantaFloorActivity::class.java),
        2015 to Day(id = 2, Solution.FULL, ElvesPaperActivity::class.java),
        2015 to Day(id = 3, Solution.FULL, SantaDirectionActivity::class.java),
        2015 to Day(id = 4, Solution.FULL, MiningActivity::class.java),
        2015 to Day(id = 5, Solution.FULL, NiceStringActivity::class.java),
        2015 to Day(id = 6, Solution.FULL, FireHazardActivity::class.java),
        2021 to Day(id = 10, Solution.FULL, SubmarineActivity::class.java)
    )

    private var yearList: List<Year>? = null

    operator fun invoke(): List<Year> = yearList ?: run {
        val list = mutableListOf<Year>()

        for (year in (MIN_YEAR..MAX_YEAR)) {
            val dayList = mutableListOf<Day>()

            for (day in (MIN_DAY..MAX_DAY)) {
                val index = solvedList.indexOfFirst { it.first == year && it.second.id == day }
                val solvedDay = solvedList.getOrNull(index)?.second
                dayList.add(solvedDay ?: Day(id = day))
            }

            list.add(Year(id = year, dayList))
        }

        yearList = list

        return list
    }

    operator fun invoke(yearId: Int): Year? = invoke().firstOrNull { it.id == yearId }

    companion object {
        const val MIN_YEAR = 2015
        const val MAX_YEAR = 2022
        const val MIN_DAY = 1
        const val MAX_DAY = 25
    }
}