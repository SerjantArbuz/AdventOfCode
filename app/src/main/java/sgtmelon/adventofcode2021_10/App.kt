package sgtmelon.adventofcode2021_10

import android.app.Application
import org.koin.core.context.startKoin
import sgtmelon.adventofcode2021_10.di.SolutionInjectionModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(SolutionInjectionModule.module)
        }
    }
}