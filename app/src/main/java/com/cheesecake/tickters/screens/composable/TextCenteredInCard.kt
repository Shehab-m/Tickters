package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TextCenteredInCard(value: String, modifier: Modifier = Modifier) {
    Text(text = value, textAlign = TextAlign.Center, modifier = modifier.fillMaxWidth())
}