package com.ebfstudio.blue.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ebfstudio.blue.MainActivity
import com.ebfstudio.blue.databinding.FragmentOnboardingBinding
import com.ebfstudio.blue.shared.EventObserver
import com.ebfstudio.blue.shared.util.autoCleared
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Vince on 13/09/2020
 */
class OnboardingFragment : Fragment() {

    private val viewModel: OnboardingViewModel by viewModel()
    private var binding: FragmentOnboardingBinding by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.pager.adapter = OnboardingAdapter(childFragmentManager)
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.navigateToMainActivity.observe(viewLifecycleOwner, EventObserver {
            requireActivity().run {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        })

        return binding.root
    }

}