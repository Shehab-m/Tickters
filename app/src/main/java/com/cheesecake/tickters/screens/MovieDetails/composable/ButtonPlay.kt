package com.cheesecake.tickters.screens.MovieDetails.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.White

@Composable
fun ButtonPlay(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        IconButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.Center)
                .clip(CircleShape)
                .size(48.dp)
                .background(Orange),

            ) {
            Icon(
                painter = painterResource(id = R.drawable.play_alt_svgrepo_com),
                contentDescription = "Play",
                tint = White,
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center)
            )
        }
    }

}