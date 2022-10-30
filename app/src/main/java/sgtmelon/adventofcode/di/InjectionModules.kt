package sgtmelon.adventofcode.di

import sgtmelon.adventofcode.menu.di.MenuInjectionModule
import sgtmelon.adventofcode.year21.day10.di.Year21Day10InjectionModule

object InjectionModules {

    val modules = listOf(
        MenuInjectionModule.module,
        Year21Day10InjectionModule.module
    )
}