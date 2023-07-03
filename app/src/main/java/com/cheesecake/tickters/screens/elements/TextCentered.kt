package com.cheesecake.tickters.screens.elements

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextCentered(
    text: String,
    size : Int,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        fontSize = (size.sp),
        textAlign = TextAlign.Center,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier.padding(top = 24.dp, end = 46.dp, start = 46.dp)
    )
}
