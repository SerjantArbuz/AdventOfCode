package sgtmelon.adventofcode.year21.day10.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year21.day10.SubmarineViewModel
import sgtmelon.adventofcode.year21.day10.useCase.GetIncompletePointsUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetLineTypeUseCase
import sgtmelon.adventofcode.year21.day10.useCase.GetMiddleValueUseCase

object Year21Day10InjectionModule {

    val module = module {

        viewModel {
            SubmarineViewModel(get(named(INPUT)), get(), get(), get(), get())
        }

        factory(named(INPUT)) { Year21Day10Input().get() }
        factory { GetLineTypeUseCase() }
        factory { GetIncompletePointsUseCase() }
        factory { GetMiddleValueUseCase() }
    }

    private const val INPUT = "YEAR_21_DAY_10_INPUT"

}