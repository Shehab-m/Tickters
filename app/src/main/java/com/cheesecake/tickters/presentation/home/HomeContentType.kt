package com.cheesecake.tickters.presentation.home

sealed class HomeContentType {
    object NowShowing: HomeContentType()
    object ComingSoon: HomeContentType()
}