package com.myprojects.msa_project

import android.app.Application
import com.myprojects.msa_project.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MSAApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MSAApplication)
            androidLogger()

            modules(appModule)
        }
    }
}