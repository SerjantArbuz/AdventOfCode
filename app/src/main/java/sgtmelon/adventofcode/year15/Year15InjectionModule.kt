package sgtmelon.adventofcode.year15

import sgtmelon.adventofcode.year15.day1.di.Year15Day1InjectionModule
import sgtmelon.adventofcode.year15.day2.di.Year15Day2InjectionModule

object Year15InjectionModule {

    val modules = arrayOf(
        Year15Day1InjectionModule.module,
        Year15Day2InjectionModule.module
    )
}