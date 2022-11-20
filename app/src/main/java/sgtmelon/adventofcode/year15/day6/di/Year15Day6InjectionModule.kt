package sgtmelon.adventofcode.year15.day6.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day6.FireHazardViewModel
import sgtmelon.adventofcode.year15.day6.useCase.ApplyInstructionUseCase
import sgtmelon.adventofcode.year15.day6.useCase.GetInstructionUseCase

object Year15Day6InjectionModule {

    val module = module {

        viewModel {
            FireHazardViewModel(get(named(INPUT)), get(), get(), get())
        }

        factory(named(INPUT)) { Year15Day6Input().get() }
        factory { GetInstructionUseCase() }
        factory { ApplyInstructionUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_6_INPUT"

}