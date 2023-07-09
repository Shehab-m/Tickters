package com.cheesecake.tickters.ui.screens.MovieDetails.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.ui.theme.MediumGrey
import com.cheesecake.tickters.ui.theme.OnBackgroundColor
import com.cheesecake.tickters.ui.theme.DarkGrey

@Composable
fun TextWithIcon(
    text: String,
    image: Painter,
    imageAlignment: ImageAlignment = ImageAlignment.Start,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.background(DarkGrey, shape = RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (imageAlignment == ImageAlignment.Start) {
            IconText(image)
        }
        Text(
            text = text, color = OnBackgroundColor,
            modifier = modifier.padding(top = 4.dp, end = 8.dp, start = 8.dp, bottom = 4.dp),
        )
        if (imageAlignment == ImageAlignment.End) {
            IconText(image)
        }
    }
}

@Composable
private fun IconText(
    image: Painter,
) {
    Icon(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .padding(start = 8.dp)
            .size(16.dp),
        tint = MediumGrey,
    )
}


enum class ImageAlignment {
    Start, End
}

