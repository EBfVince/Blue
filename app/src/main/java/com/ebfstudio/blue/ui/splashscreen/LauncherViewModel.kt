package com.ebfstudio.blue.ui.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ebfstudio.blue.repo.PreferenceStorage
import kotlinx.coroutines.Dispatchers

/**
 * Created by Vince on 28/08/2020
 */
class LauncherViewModel(prefsStorage: PreferenceStorage) : ViewModel() {

    val launchDestination = liveData(Dispatchers.IO) {
        val result = prefsStorage.onboardingCompleted
        emit(result)
    }

}