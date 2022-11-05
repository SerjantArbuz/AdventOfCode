package sgtmelon.adventofcode.year15.day5.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day5.NiceStringViewModel
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString1UseCase
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceString2UseCase

object Year15Day5InjectionModule {

    val module = module {

        viewModel {
            NiceStringViewModel(NiceStringInput().get(), get(), get(), get())
        }

        factory { IsNiceString1UseCase() }
        factory { IsNiceString2UseCase() }
    }
}