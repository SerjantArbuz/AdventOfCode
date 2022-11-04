package sgtmelon.adventofcode.year15.day4.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day4.MiningViewModel

object Year15Day4InjectionModule {

    val module = module {

        viewModel {
            MiningViewModel()
        }
    }
}