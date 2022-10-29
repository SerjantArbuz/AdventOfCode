package sgtmelon.adventofcode.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.SolutionViewModelImpl
import sgtmelon.adventofcode.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode.useCase.GetMiddleValueUseCase
import sgtmelon.adventofcode.useCase.SplitTextUseCase

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