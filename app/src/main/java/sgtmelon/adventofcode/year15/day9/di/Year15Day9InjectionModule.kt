package sgtmelon.adventofcode.year15.day9.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day9.Year15Day9ViewModel
import sgtmelon.adventofcode.year15.day9.useCase.GetUniqueSequencesUseCase
import sgtmelon.adventofcode.year15.day9.useCase.ParseDistanceUseCase

object Year15Day9InjectionModule {

    val module = module {

        viewModel {
            Year15Day9ViewModel(get(named(INPUT)), get(), get(), get())
        }

        factory(named(INPUT)) { Year15Day9Input().get() }
        factory { ParseDistanceUseCase() }
        factory { GetUniqueSequencesUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_9_INPUT"

}