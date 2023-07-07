package com.cheesecake.tickters.screens.BookingScreen.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R

@Composable
fun ImageHeaderCinema(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.img_1),
        contentDescription = "Cinema",
        contentScale = ContentScale.FillBounds,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(.12f)
    )
}