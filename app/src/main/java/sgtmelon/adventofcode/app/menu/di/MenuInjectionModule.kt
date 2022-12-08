package sgtmelon.adventofcode.app.menu.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.app.menu.MainMenuViewModelImpl
import sgtmelon.adventofcode.app.menu.SolutionMenuViewModelImpl
import sgtmelon.adventofcode.app.menu.useCase.GetYearsUseCase

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