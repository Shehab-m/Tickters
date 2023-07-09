package com.cheesecake.tickters.ui.screens.BookingScreen.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageHeader(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = painter,
        contentDescription = "Cinema",
        contentScale = ContentScale.FillBounds,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(.15f)
    )
}

