package sgtmelon.adventofcode.year15.day7.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day7.WireViewModel
import sgtmelon.adventofcode.year15.day7.useCase.CalculateWiresUseCase
import sgtmelon.adventofcode.year15.day7.useCase.GetCommandUseCase

object Year15Day7InjectionModule {

    val module = module {

        viewModel {
            WireViewModel(get(named(INPUT)), get(), get(), get())
        }

        factory(named(INPUT)) { Year15Day7Input().get() }
        factory { GetCommandUseCase() }
        factory { CalculateWiresUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_7_INPUT"

}