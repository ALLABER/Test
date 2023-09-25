package com.allaber.intro.internal.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.intro.R
import com.allaber.intro.databinding.FragmentAgeBinding
import com.allaber.navigation.launchDeeplink
import com.allaber.navigation.link.HomeDeepLink

internal class AgeFragment : Fragment(R.layout.fragment_age) {

    private val binding: FragmentAgeBinding by viewBinding(
        FragmentAgeBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewsListener()
    }

    private fun setupViewsListener() {
        binding.textView.setOnClickListener {
            launchDeeplink(HomeDeepLink())
        }
    }
}
