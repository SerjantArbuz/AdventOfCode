package sgtmelon.adventofcode.year15.day1.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day1.Year15Day1ViewModel
import sgtmelon.adventofcode.year15.day1.useCase.GetFloorAndBasementUseCase

object Year15Day1InjectionModule {

    val module = module {

        viewModel {
            Year15Day1ViewModel(get(named(INPUT)), get())
        }

        factory(named(INPUT)) { Year15Day1Input().get() }
        factory { GetFloorAndBasementUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_1_INPUT"

}