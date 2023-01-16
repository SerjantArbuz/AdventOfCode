package sgtmelon.adventofcode.app.blank.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import sgtmelon.adventofcode.app.blank.BlankViewModel

object BlankInjectionModule {

    val module = module {

        viewModel {
            BlankViewModel(get(named(INPUT)))
        }

        factory(named(INPUT)) { BlankInput().get() }
    }

    private const val INPUT = "YEAR_!!_DAY_!_INPUT"

}