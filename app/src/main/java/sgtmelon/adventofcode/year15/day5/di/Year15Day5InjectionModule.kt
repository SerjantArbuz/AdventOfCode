package sgtmelon.adventofcode.year15.day5.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day5.NiceStringViewModel

object Year15Day5InjectionModule {

    val module = module {

        viewModel {
            NiceStringViewModel(NiceStringInput().get(), get())
        }
    }
}