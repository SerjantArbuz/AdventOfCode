package sgtmelon.adventofcode.year15.day4.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day4.MiningViewModelImpl
import sgtmelon.adventofcode.year15.day4.useCase.GetHexUseCase
import sgtmelon.adventofcode.year15.day4.useCase.GetMD5UseCase

object Year15Day4InjectionModule {

    val module = module {

        viewModel {
            MiningViewModelImpl(MiningInput().get(), get(), get())
        }

        factory { GetMD5UseCase() }
        factory { GetHexUseCase() }
    }
}