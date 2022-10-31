package sgtmelon.adventofcode.year15.day1.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day1.SantaFloorViewModelImpl
import sgtmelon.adventofcode.year15.day1.useCase.GetFloorAndBasementUseCase

object Year15Day1InjectionModule {

    val module = module {

        viewModel {
            SantaFloorViewModelImpl(FloorInput().get(), get())
        }

        factory { GetFloorAndBasementUseCase() }
    }
}