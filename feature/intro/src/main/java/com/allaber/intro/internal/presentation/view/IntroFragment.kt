package com.allaber.intro.internal.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.intro.R
import com.allaber.intro.databinding.FragmentIntroBinding

internal class IntroFragment : Fragment(R.layout.fragment_intro) {

    private val binding: FragmentIntroBinding by viewBinding(
        FragmentIntroBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewsListener()
    }

    private fun setupViewsListener() {
        binding.textView.setOnClickListener {
            findNavController().navigate(R.id.action_introFragment_to_ageFragment)
        }
    }
}
