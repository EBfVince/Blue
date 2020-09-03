package com.ebfstudio.blue.init

import android.content.Context
import androidx.startup.Initializer
import com.ebfstudio.blue.BuildConfig
import timber.log.Timber

/**
 * Created by Vince on 28/08/2020
 */
class TimberInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            TODO("Timber.plant(CrashlyticsTree())")
        }
        Timber.d("init ok")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()

}
