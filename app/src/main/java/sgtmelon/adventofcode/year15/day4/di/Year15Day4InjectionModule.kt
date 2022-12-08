package sgtmelon.adventofcode.year15.day4.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day4.Year15Day4ViewModelImpl
import sgtmelon.adventofcode.year15.day4.useCase.GetHexUseCase
import sgtmelon.adventofcode.year15.day4.useCase.GetMD5UseCase

object Year15Day4InjectionModule {

    val module = module {

        viewModel {
            Year15Day4ViewModelImpl(get(named(INPUT)), get(), get())
        }

        single(named(INPUT)) { Year15Day4Input().get() }
        factory { GetMD5UseCase() }
        factory { GetHexUseCase() }
    }

    private const val INPUT = "YEAR_15_DAY_4_INPUT"
}