package sgtmelon.adventofcode2021_10.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode2021_10.SolutionViewModel

object SolutionInjectionModule {

    val module = module {

        viewModel {
            SolutionViewModel()
        }
    }
}