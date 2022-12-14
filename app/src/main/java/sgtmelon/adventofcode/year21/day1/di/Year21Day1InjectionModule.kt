package sgtmelon.adventofcode.year21.day1.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year21.day1.Year21Day1ViewModel
import sgtmelon.adventofcode.year21.day1.useCase.CalculateChangesUseCase

object Year21Day1InjectionModule {

    val module = module {

        viewModel {
            Year21Day1ViewModel(get(named(INPUT)), get(), get())
        }

        factory(named(INPUT)) { Year21Day1Input().get() }
        factory { CalculateChangesUseCase() }
    }


    private const val INPUT = "YEAR_21_DAY_1_INPUT"

}