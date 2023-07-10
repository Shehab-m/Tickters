package com.cheesecake.tickters.presentation.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.presentation.home.HomeContentType
import com.cheesecake.tickters.presentation.home.viewModel.HomeScreenInteractions
import com.cheesecake.tickters.presentation.home.viewModel.state.HomeUIState

@Composable
fun HomeContentHeader(contentType: HomeContentType, viewModel: HomeScreenInteractions) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {

        ButtonHomeContent(
            buttonText = "Now Showing",
            selected = contentType == HomeContentType.NowShowing,
            onClick = { viewModel.updateHomeContent(HomeContentType.NowShowing) }
        )

        ButtonHomeContent(
            buttonText = "Coming Soon",
            selected = contentType == HomeContentType.ComingSoon,
            onClick = { viewModel.updateHomeContent(HomeContentType.ComingSoon) }
        )

    }
}