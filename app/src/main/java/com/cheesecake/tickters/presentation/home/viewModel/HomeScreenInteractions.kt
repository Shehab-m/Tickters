package com.cheesecake.tickters.presentation.home.viewModel

import com.cheesecake.tickters.presentation.home.HomeContentType

interface HomeScreenInteractions {
    fun updateHomeContent(selectedContent: HomeContentType)
}