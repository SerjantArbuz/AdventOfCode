package sgtmelon.adventofcode.year15.day2.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.common.SplitTextUseCase
import sgtmelon.adventofcode.year15.day2.ElvesPaperViewModelImpl
import sgtmelon.adventofcode.year15.day2.useCase.GetSquareUseCase
import sgtmelon.adventofcode.year15.day2.useCase.GetSurfaceAreaUseCase

object Year15Day2InjectionModule {

    val module = module {

        viewModel {
            ElvesPaperViewModelImpl(ElvesPaperInput().getInput(), get(), get(), get())
        }

        factory { SplitTextUseCase() }
        factory { GetSquareUseCase() }
        factory { GetSurfaceAreaUseCase() }
    }
}