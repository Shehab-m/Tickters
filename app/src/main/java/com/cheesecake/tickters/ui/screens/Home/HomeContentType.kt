package com.cheesecake.tickters.ui.screens.Home

sealed class HomeContentType {
    object NowShowing: HomeContentType()
    object ComingSoon: HomeContentType()
}