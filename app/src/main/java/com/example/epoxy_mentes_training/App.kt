package com.example.epoxy_mentes_training

import android.app.Application
import com.airbnb.viewmodeladapter.BuildConfig
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
