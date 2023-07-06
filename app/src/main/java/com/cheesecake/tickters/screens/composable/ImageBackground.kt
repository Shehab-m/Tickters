package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun ImageBackground(imageUrl: String) {
    Image(
        painter = rememberAsyncImagePainter(model = imageUrl),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .blur(radius = 50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
            .fillMaxWidth()
            .fillMaxHeight(0.4f)
    )
}