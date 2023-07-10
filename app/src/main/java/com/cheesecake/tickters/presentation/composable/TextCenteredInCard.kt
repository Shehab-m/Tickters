package com.cheesecake.tickters.presentation.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TextCenteredInCard(text: String, modifier: Modifier = Modifier, textColor: Color) {
    Text(
        text = text,
        color = textColor,
        textAlign = TextAlign.Center,
        modifier = modifier.fillMaxWidth()
    )
}