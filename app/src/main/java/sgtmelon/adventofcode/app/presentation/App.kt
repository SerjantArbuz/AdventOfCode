package sgtmelon.adventofcode.app.presentation

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import sgtmelon.adventofcode.app.di.InjectionModules

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(InjectionModules.modules)
        }
    }
}