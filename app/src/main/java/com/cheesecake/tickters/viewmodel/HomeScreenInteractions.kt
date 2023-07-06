package com.cheesecake.tickters.viewmodel

import com.cheesecake.tickters.viewmodel.model.HomeContentType

interface HomeScreenInteractions {
    fun updateHomeContent(selectedContent: HomeContentType)
}