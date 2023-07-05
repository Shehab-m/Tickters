package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

@Composable
fun RowSeat(rotation: Float = 0f) {
    Row(modifier = Modifier
        .rotate(rotation)
        .padding(vertical = 8.dp)) {
        IconSeat()
        IconSeat()

    }
}