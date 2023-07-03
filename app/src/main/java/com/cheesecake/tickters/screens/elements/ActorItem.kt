package com.cheesecake.tickters.screens.elements

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.R

@Composable
fun ImageItem(url: String) {
    Image(
        painter = rememberAsyncImagePainter(model = url),
        contentDescription = "Actor/Actress",
        modifier = Modifier
            .clip(shape = CircleShape)
            .size(85.dp)
    )
    Log.i( "MovieContent: ","in")
}