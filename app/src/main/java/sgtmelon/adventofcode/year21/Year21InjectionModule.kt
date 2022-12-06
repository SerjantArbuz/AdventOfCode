package sgtmelon.adventofcode.year21

import sgtmelon.adventofcode.year21.day1.di.Year21Day1InjectionModule
import sgtmelon.adventofcode.year21.day10.di.Year21Day10InjectionModule

object Year21InjectionModule {

    val modules = arrayOf(
        Year21Day1InjectionModule.module,
        Year21Day10InjectionModule.module,
    )
}