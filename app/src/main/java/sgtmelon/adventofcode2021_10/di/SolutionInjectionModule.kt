package sgtmelon.adventofcode2021_10.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode2021_10.SolutionViewModelImpl
import sgtmelon.adventofcode2021_10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode2021_10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode2021_10.useCase.GetMiddleValueUseCase
import sgtmelon.adventofcode2021_10.useCase.SplitTextUseCase

object SolutionInjectionModule {

    val module = module {

        viewModel {
            SolutionViewModelImpl(PuzzleInput.input, get(), get(), get(), get())
        }

        factory {
            SplitTextUseCase()
        }

        factory {
            GetLineTypeUseCase()
        }

        factory {
            GetIncompletePointsUseCase()
        }

        factory {
            GetMiddleValueUseCase()
        }
    }
}