package com.ebfstudio.blue.init

import android.content.Context
import androidx.startup.Initializer
import com.ebfstudio.blue.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

/**
 * Created by Vince on 28/08/2020
 */
class KoinInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(context)
            modules(appComponent)
        }
        Timber.d("init ok")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf(
        TimberInitializer::class.java,
        ThreeTenInitializer::class.java
    )

}
