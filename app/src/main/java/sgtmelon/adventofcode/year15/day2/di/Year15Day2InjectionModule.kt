package sgtmelon.adventofcode.year15.day2.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day2.Year15Day2ViewModel
import sgtmelon.adventofcode.year15.day2.useCase.GetSquareUseCase
import sgtmelon.adventofcode.year15.day2.useCase.GetSurfaceAreaUseCase

object Year15Day2InjectionModule {

    val module = module {

        viewModel {
            Year15Day2ViewModel(get(named(INPUT)), get(), get(), get())
        }

        factory(named(INPUT)) { Year15Day2Input().get() }
        factory { GetSquareUseCase() }
        factory { GetSurfaceAreaUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_2_INPUT"

}