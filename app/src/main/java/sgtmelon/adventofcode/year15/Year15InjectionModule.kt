package sgtmelon.adventofcode.year15

import sgtmelon.adventofcode.year15.day1.di.Year15Day1InjectionModule
import sgtmelon.adventofcode.year15.day2.di.Year15Day2InjectionModule
import sgtmelon.adventofcode.year15.day3.di.Year15Day3InjectionModule
import sgtmelon.adventofcode.year15.day4.di.Year15Day4InjectionModule
import sgtmelon.adventofcode.year15.day5.di.Year15Day5InjectionModule
import sgtmelon.adventofcode.year15.day6.di.Year15Day6InjectionModule
import sgtmelon.adventofcode.year15.day7.di.Year15Day7InjectionModule
import sgtmelon.adventofcode.year15.day8.di.Year15Day8InjectionModule

object Year15InjectionModule {

    val modules = arrayOf(
        Year15Day1InjectionModule.module,
        Year15Day2InjectionModule.module,
        Year15Day3InjectionModule.module,
        Year15Day4InjectionModule.module,
        Year15Day5InjectionModule.module,
        Year15Day6InjectionModule.module,
        Year15Day7InjectionModule.module,
        Year15Day8InjectionModule.module,
    )
}