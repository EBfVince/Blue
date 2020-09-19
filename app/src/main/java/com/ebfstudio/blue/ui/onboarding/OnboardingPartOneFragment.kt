package com.ebfstudio.blue.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ebfstudio.blue.databinding.FragmentPartOneBinding
import com.ebfstudio.blue.shared.util.autoCleared

/**
 * Created by Vince on 13/09/2020
 */
class OnboardingPartOneFragment : Fragment() {

    private var binding: FragmentPartOneBinding by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPartOneBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

}