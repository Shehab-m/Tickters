package com.cheesecake.tickters.ui.screens.MovieDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun ImageActorItem(url: String) {


    Image(
        painter = rememberAsyncImagePainter(model = url),
        contentDescription = "Actor/Actress",
        modifier = Modifier
            .clip(shape = CircleShape)
            .size(75.dp),
        contentScale = ContentScale.FillBounds,
    )
}