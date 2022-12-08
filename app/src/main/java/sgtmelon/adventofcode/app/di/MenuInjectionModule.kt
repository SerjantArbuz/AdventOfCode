package sgtmelon.adventofcode.app.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.app.domain.GetYearsUseCase
import sgtmelon.adventofcode.app.presentation.screen.menu.main.MainMenuViewModelImpl
import sgtmelon.adventofcode.app.presentation.screen.menu.solution.SolutionsMenuViewModelImpl

object MenuInjectionModule {

    val module = module {

        viewModel {
            MainMenuViewModelImpl(get())
        }

        viewModel {
            SolutionsMenuViewModelImpl(get(), get())
        }

        single { GetYearsUseCase() }
    }
}