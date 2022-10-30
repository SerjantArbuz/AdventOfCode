package sgtmelon.adventofcode.di

import sgtmelon.adventofcode.menu.di.MenuInjectionModule
import sgtmelon.adventofcode.year15.day1.di.Year15Day1InjectionModule
import sgtmelon.adventofcode.year21.day10.di.Year21Day10InjectionModule

object InjectionModules {

    val modules = listOf(
        MenuInjectionModule.module,
        Year15Day1InjectionModule.module,
        Year21Day10InjectionModule.module
    )
}