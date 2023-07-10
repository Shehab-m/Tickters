package com.cheesecake.tickters.presentation.movieDetails.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageMovie(
    painter: Painter
) {
    Image(
        painter = painter,
        contentDescription = "Movie Image",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f),
        contentScale = ContentScale.FillBounds,
    )
}