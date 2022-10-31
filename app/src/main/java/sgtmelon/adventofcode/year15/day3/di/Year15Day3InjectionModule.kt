package sgtmelon.adventofcode.year15.day3.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day3.SantaDirectionViewModel
import sgtmelon.adventofcode.year15.day3.useCase.GetUniqueHousesUseCase
import sgtmelon.adventofcode.year15.day3.useCase.GetWithRobotHousesUseCase

object Year15Day3InjectionModule {

    val module = module {

        viewModel {
            SantaDirectionViewModel(SantaDirectionInput().get(), get(), get())
        }

        factory { GetUniqueHousesUseCase() }
        factory { GetWithRobotHousesUseCase() }
    }
}