package sgtmelon.adventofcode2021_10.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode2021_10.SolutionViewModel
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

object SolutionInjectionModule {

    val module = module {

        viewModel {
            SolutionViewModel(get())
        }

        factory {
            SplitTextUseCase()
        }
    }
}