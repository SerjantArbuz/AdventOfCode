package sgtmelon.adventofcode.year15.day2.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day2.ElvesPaperViewModel
import sgtmelon.adventofcode.year15.day2.useCase.GetSquareUseCase
import sgtmelon.adventofcode.year15.day2.useCase.GetSurfaceAreaUseCase

object Year15Day2InjectionModule {

    val module = module {

        viewModel {
            ElvesPaperViewModel(ElvesPaperInput().get(), get(), get(), get())
        }

        factory { GetSquareUseCase() }
        factory { GetSurfaceAreaUseCase() }
    }
}