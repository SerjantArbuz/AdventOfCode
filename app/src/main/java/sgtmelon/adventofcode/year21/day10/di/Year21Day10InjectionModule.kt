package sgtmelon.adventofcode.year21.day10.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year21.day10.SubmarineViewModelImpl
import sgtmelon.adventofcode.year21.day10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetMiddleValueUseCase

object Year21Day10InjectionModule {

    val module = module {

        viewModel {
            SubmarineViewModelImpl(SubmarineInput().getInput(), get(), get(), get(), get())
        }

        factory { GetLineTypeUseCase() }
        factory { GetIncompletePointsUseCase() }
        factory { GetMiddleValueUseCase() }
    }
}