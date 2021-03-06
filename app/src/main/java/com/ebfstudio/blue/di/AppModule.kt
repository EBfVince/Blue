package com.ebfstudio.blue.di

import com.ebfstudio.blue.repo.PreferenceStorage
import com.ebfstudio.blue.repo.SharedPrefsStorage
import com.ebfstudio.blue.ui.onboarding.OnboardingViewModel
import com.ebfstudio.blue.ui.splashscreen.LauncherViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Vince on 28/08/2020
 */
val appModule = module {
    viewModel { LauncherViewModel(get()) }
    viewModel { OnboardingViewModel(get()) }
    single<PreferenceStorage> { SharedPrefsStorage(androidContext()) }
}