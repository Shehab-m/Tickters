package com.cheesecake.tickters.screens.elements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.ui.theme.ChipColor
import com.cheesecake.tickters.ui.theme.DarkGrey
import com.cheesecake.tickters.ui.theme.White

@Composable
fun Chip(text: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, DarkGrey),
        modifier = Modifier.padding(4.dp)
    ) {

        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(White)
                .padding(horizontal = 13.dp, vertical = 6.dp)
        )

    }
}
