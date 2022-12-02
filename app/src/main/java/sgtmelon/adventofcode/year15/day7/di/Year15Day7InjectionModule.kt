package sgtmelon.adventofcode.year15.day7.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day7.WireViewModel

object Year15Day7InjectionModule {

    val module = module {

        viewModel {
            WireViewModel(get(named(INPUT)), get())
        }

        factory(named(INPUT)) { Year15Day7Input().get() }
    }

    private const val INPUT = "YEAR_15_DAY_7_INPUT"

}