package sgtmelon.adventofcode.year15.day2.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day2.ElvesPaperViewModelImpl

object Year15Day2InjectionModule {

    val module = module {

        viewModel {
            ElvesPaperViewModelImpl(get())
        }

        factory { ElvesPaperInput().getInput() }
    }
}