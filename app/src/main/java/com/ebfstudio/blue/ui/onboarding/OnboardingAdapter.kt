package com.ebfstudio.blue.ui.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created by Vince on 13/09/2020
 */
class OnboardingAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    private val fragments: Array<Fragment> = arrayOf(OnboardingPartOneFragment(), OnboardingPartOneFragment())

    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size

}