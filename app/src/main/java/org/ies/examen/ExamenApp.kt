package org.ies.examen

import android.app.Application
import org.ies.examen.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ExamenApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin() {
            androidContext(this@ExamenApp)
            modules(
                appModule
            )
        }
    }
}