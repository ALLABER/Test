package com.allaber.navigation.link

import android.net.Uri
import androidx.core.net.toUri

class HomeDeepLink : DeepLink {
    override val uri: Uri get() = "app://allaber_test_home".toUri()
}
