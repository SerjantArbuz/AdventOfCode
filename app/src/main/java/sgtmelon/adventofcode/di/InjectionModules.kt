package sgtmelon.adventofcode.di

import sgtmelon.adventofcode.menu.di.MenuInjectionModule
import sgtmelon.adventofcode.year15.Year15InjectionModule
import sgtmelon.adventofcode.year21.Year21InjectionModule

object InjectionModules {

    val modules = listOf(
        MenuInjectionModule.module,
        *Year15InjectionModule.modules,
        *Year21InjectionModule.modules
    )
}