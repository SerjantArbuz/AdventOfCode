package sgtmelon.adventofcode.year15.day5.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day5.NiceStringViewModel
import sgtmelon.adventofcode.year15.day5.useCase.IsNiceStringUseCase

object Year15Day5InjectionModule {

    val module = module {

        viewModel {
            NiceStringViewModel(NiceStringInput().get(), get(), get())
        }

        factory { IsNiceStringUseCase() }
    }
}