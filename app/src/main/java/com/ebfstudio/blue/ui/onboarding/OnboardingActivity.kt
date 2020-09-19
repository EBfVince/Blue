package com.ebfstudio.blue.ui.onboarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ebfstudio.blue.R
import com.ebfstudio.blue.shared.util.inTransaction

/**
 * Created by Vince on 13/09/2020
 */
class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(R.id.fragment_container, OnboardingFragment())
            }
        }
    }

}