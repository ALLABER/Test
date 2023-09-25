package com.allaber.navigation

import android.net.Uri
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.allaber.navigation.link.DeepLink

fun Fragment.launchDeeplink(uri: Uri) {
    if (findNavController().graph.hasDeepLink(uri)) {
        findNavController().navigate(
            uri,
            navOptions {
                restoreState = true
            }
        )
    } else {
        (requireActivity() as? DeepLinkNavigation)?.launchDeepLink(uri)
    }
}

fun Fragment.launchDeeplink(deepLink: DeepLink) {
    this.launchDeeplink(deepLink.uri)
}
