package sgtmelon.adventofcode

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import sgtmelon.adventofcode.di.InjectionModules
import sgtmelon.adventofcode.year21.day10.di.Year21Day10InjectionModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(InjectionModules.modules)
        }
    }
}