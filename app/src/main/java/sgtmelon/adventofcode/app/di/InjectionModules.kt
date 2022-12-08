package sgtmelon.adventofcode.app.di

import org.koin.dsl.module
import sgtmelon.adventofcode.app.common.SplitTextUseCase
import sgtmelon.adventofcode.app.menu.di.MenuInjectionModule
import sgtmelon.adventofcode.year15.Year15InjectionModule
import sgtmelon.adventofcode.year21.Year21InjectionModule

object InjectionModules {

    private val module = module {
        factory { SplitTextUseCase() }
    }

    val modules = listOf(
        module,
        MenuInjectionModule.module,
        *Year15InjectionModule.modules,
        *Year21InjectionModule.modules
    )

}