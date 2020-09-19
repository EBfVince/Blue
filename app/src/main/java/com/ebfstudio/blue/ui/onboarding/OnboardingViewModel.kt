package com.ebfstudio.blue.ui.onboarding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ebfstudio.blue.repo.PreferenceStorage
import com.ebfstudio.blue.shared.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by Vince on 13/09/2020
 */
class OnboardingViewModel(private val prefsStorage: PreferenceStorage) : ViewModel() {

    private val _navigateToMainActivity = MutableLiveData<Event<Unit>>()
    val navigateToMainActivity: LiveData<Event<Unit>> = _navigateToMainActivity

    fun getStartedClick() {
        viewModelScope.launch(Dispatchers.IO) {
            prefsStorage.onboardingCompleted = true
            _navigateToMainActivity.postValue(Event(Unit))
        }
    }

}
