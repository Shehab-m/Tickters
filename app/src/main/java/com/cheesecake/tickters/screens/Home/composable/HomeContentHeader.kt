package com.cheesecake.tickters.screens.Home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.viewmodel.HomeScreenInteractions
import com.cheesecake.tickters.viewmodel.model.HomeContentType
import com.cheesecake.tickters.viewmodel.state.HomeUIState

@Composable
fun HomeContentHeader(state: HomeUIState, viewModel: HomeScreenInteractions) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {

        ButtonHomeContent(
            buttonText = "Now Showing",
            selected = state.homeContentType == HomeContentType.NowShowing,
            onClick = { viewModel.updateHomeContent(HomeContentType.NowShowing) }
        )

        ButtonHomeContent(
            buttonText = "Coming Soon",
            selected = state.homeContentType == HomeContentType.ComingSoon,
            onClick = { viewModel.updateHomeContent(HomeContentType.ComingSoon) }
        )

    }
}