package sgtmelon.adventofcode.year21.day10.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year21.day10.SubmarineViewModelImpl
import sgtmelon.adventofcode.year21.day10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetMiddleValueUseCase
import sgtmelon.adventofcode.year21.day10.useCase.SplitTextUseCase

object Year21Day10InjectionModule {

    val module = module {

        viewModel {
            SubmarineViewModelImpl(get(), get(), get(), get(), get())
        }

        factory { SubmarineInput().getInput() }
        factory { SplitTextUseCase() }
        factory { GetLineTypeUseCase() }
        factory { GetIncompletePointsUseCase() }
        factory { GetMiddleValueUseCase() }
    }
}