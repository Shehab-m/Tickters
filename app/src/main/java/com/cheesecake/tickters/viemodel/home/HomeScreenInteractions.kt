package com.cheesecake.tickters.viemodel.home

import com.cheesecake.tickters.ui.screens.Home.HomeContentType

interface HomeScreenInteractions {
    fun updateHomeContent(selectedContent: HomeContentType)
}