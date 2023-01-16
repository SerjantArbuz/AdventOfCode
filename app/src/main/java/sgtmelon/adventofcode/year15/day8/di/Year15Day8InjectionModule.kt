package sgtmelon.adventofcode.year15.day8.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day8.Year15Day8ViewModel
import sgtmelon.adventofcode.year15.day8.useCase.GetStringLengthUseCase

object Year15Day8InjectionModule {

    val module = module {

        viewModel {
            Year15Day8ViewModel(get(named(INPUT)), get(), get())
        }

        factory(named(INPUT)) { Year15Day8Input().get() }
        factory { GetStringLengthUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_8_INPUT"

}