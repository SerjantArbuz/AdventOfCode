package sgtmelon.adventofcode.year15.day3.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day3.SantaDirectionViewModelImpl
import sgtmelon.adventofcode.year15.day3.useCase.GetUniqueHousesUseCase

object Year15Day3InjectionModule {

    val module = module {

        viewModel {
            SantaDirectionViewModelImpl(SantaDirectionInput().get(), get())
        }

        factory { GetUniqueHousesUseCase() }
    }
}