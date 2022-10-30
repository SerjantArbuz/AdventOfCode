package sgtmelon.adventofcode.menu.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.menu.MainMenuViewModelImpl
import sgtmelon.adventofcode.menu.SolutionMenuViewModelImpl
import sgtmelon.adventofcode.menu.useCase.GetYearsUseCase

object MenuInjectionModule {

    val module = module {

        viewModel {
            MainMenuViewModelImpl(get())
        }

        viewModel {
            SolutionMenuViewModelImpl(get(), get())
        }

        single { GetYearsUseCase() }
    }
}