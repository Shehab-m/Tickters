package com.cheesecake.tickters.ui.screens.Home.composable

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.White_36

@Composable
fun ButtonHomeContent(
    buttonText: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (selected) Orange else Color.Transparent
    )
    val borderColor by animateColorAsState(
        targetValue = if (selected) Orange else White_36
    )

    Button(
        onClick = onClick,
        modifier = Modifier.padding(end = 4.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        ),
        border = BorderStroke(width = 2.dp, color = borderColor)
    ) {
        Text(text = buttonText)
    }
}
