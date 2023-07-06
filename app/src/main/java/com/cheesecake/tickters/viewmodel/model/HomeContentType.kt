package com.cheesecake.tickters.viewmodel.model

sealed class HomeContentType {
    object NowShowing: HomeContentType()
    object ComingSoon: HomeContentType()
}