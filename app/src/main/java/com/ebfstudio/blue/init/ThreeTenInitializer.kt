package com.ebfstudio.blue.init

import android.content.Context
import androidx.startup.Initializer
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber

/**
 * Created by Vince on 28/08/2020
 */
class ThreeTenInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        AndroidThreeTen.init(context)
        Timber.d("init ok")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> =
        mutableListOf(TimberInitializer::class.java)

}
