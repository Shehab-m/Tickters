package com.cheesecake.tickters.presentation.home.composable

import android.annotation.SuppressLint
import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.dataSource.Entity.Movie
import com.cheesecake.tickters.presentation.home.viewModel.state.HomeUIState

@Composable
fun BackgroundImage(movies: List<Movie>, pagerPosition: Int) {
    val currentImageUrl = remember(pagerPosition) {
        movies[pagerPosition].imageUrl
    }
    val painter = rememberAsyncImagePainter(model = currentImageUrl)

    Crossfade(targetState = painter, animationSpec = tween(1000)) { imagePainter ->
        Image(
            painter = imagePainter,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .blur(radius = 50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
        )
    }
}
