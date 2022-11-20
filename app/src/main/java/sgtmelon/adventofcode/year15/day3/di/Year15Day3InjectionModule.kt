package sgtmelon.adventofcode.year15.day3.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day3.SantaDirectionViewModel
import sgtmelon.adventofcode.year15.day3.useCase.GetUniqueHousesUseCase
import sgtmelon.adventofcode.year15.day3.useCase.GetWithRobotHousesUseCase

object Year15Day3InjectionModule {

    val module = module {

        viewModel {
            SantaDirectionViewModel(get(named(INPUT)), get(), get())
        }

        factory(named(INPUT)) { Year15Day3Input().get() }
        factory { GetUniqueHousesUseCase() }
        factory { GetWithRobotHousesUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_3_INPUT"

}