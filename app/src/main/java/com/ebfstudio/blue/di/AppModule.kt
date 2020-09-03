package com.ebfstudio.blue.di

import com.ebfstudio.blue.repo.PreferenceStorage
import com.ebfstudio.blue.repo.SharedPrefsStorage
import com.ebfstudio.blue.ui.splashscreen.SplashViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Vince on 28/08/2020
 */
val appModule = module {
    viewModel { SplashViewModel(get()) }
    single<PreferenceStorage> { SharedPrefsStorage(androidContext()) }
}