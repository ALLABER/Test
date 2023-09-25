package com.allaber.test.presentation.view

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.allaber.navigation.DeepLinkNavigation
import com.allaber.test.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), DeepLinkNavigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun launchDeepLink(uri: Uri) {
        Navigation.findNavController(this, R.id.nav_host_fragment).navigate(uri)
    }
}
