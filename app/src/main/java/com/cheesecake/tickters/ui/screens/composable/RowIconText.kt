package com.cheesecake.tickters.ui.screens.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.theme.MediumGrey

@Composable
fun RowIconText(
    text: String,
    iconColor: Color,
    painter: Painter,
    modifier: Modifier = Modifier,
    iconSize: Dp = 20.dp,
    textColor: Color = MediumGrey,
    iconContentDescription: String? = null
) {
    Row(modifier = modifier) {
        Icon(
            painter = painter,
            contentDescription = iconContentDescription,
            modifier = Modifier.size(iconSize).padding(end = 4.dp),
            tint = iconColor
        )
        Text(text = text, color = textColor)
    }
}
