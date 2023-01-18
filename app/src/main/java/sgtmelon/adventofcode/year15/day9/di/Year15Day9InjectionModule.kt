package sgtmelon.adventofcode.year15.day9.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.year15.day9.Year15Day9ViewModel

object Year15Day9InjectionModule {

    val module = module {

        viewModel {
            Year15Day9ViewModel(get(named(INPUT)))
        }

        factory(named(INPUT)) { Year15Day9Input().get() }
    }

    private const val INPUT = "YEAR_15_DAY_9_INPUT"

}