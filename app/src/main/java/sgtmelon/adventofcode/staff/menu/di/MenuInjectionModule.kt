package sgtmelon.adventofcode.staff.menu.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.staff.menu.MainMenuViewModelImpl
import sgtmelon.adventofcode.staff.menu.SolutionMenuViewModelImpl
import sgtmelon.adventofcode.staff.menu.useCase.GetYearsUseCase

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