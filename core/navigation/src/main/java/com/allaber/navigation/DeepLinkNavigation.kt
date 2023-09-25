package com.allaber.navigation

import android.net.Uri

interface DeepLinkNavigation {
    fun launchDeepLink(uri: Uri)
}
