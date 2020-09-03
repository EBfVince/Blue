package com.ebfstudio.blue.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ebfstudio.blue.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Vince on 28/08/2020
 */
class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: LauncherViewModel by viewModel()
        viewModel.launchDestination.observe(this, {
            if (!it) {
                startActivity(Intent(this, MainActivity::class.java))
            }
            finish()
        })
    }

}
