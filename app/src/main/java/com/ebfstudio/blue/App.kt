package com.ebfstudio.blue

import android.app.Application
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy.Builder

class App : Application() {

    override fun onCreate() {

        // Enable strict mode
        if (BuildConfig.DEBUG) {
            enableStrictMode()
        }

        super.onCreate()

    }

    private fun enableStrictMode() {
        StrictMode.setThreadPolicy(
            Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .penaltyLog()
                .build()
        )
    }

}