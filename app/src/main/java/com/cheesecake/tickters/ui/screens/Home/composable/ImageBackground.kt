package com.cheesecake.tickters.ui.screens.Home.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.ui.screens.Home.state.HomeUIState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageBackground(state: HomeUIState, pagerState: PagerState) {
    Image(
        painter = rememberAsyncImagePainter(model = state.movies[pagerState.currentPage].imageUrl),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .blur(radius = 50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
    )
}