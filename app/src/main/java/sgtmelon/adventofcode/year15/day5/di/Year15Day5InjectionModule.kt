package sgtmelon.adventofcode.year15.day5.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day5.NiceStringViewModel
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString1UseCase
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString2UseCase

object Year15Day5InjectionModule {

    val module = module {

        viewModel {
            NiceStringViewModel(get(named(INPUT)), get(), get(), get())
        }

        factory(named(INPUT)) { Year15Day5Input().get() }
        factory { IsNiceString1UseCase() }
        factory { IsNiceString2UseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_5_INPUT"

}