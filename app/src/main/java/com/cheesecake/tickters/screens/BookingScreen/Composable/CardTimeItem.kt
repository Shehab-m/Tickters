package com.cheesecake.tickters.screens.BookingScreen.Composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.screens.composable.ColumnFillInCard
import com.cheesecake.tickters.screens.composable.TextCenteredInCard
import com.cheesecake.tickters.ui.theme.DarkGrey

@Composable
fun CardTimeItem(time: String) {
    Card(
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, DarkGrey),
        modifier = Modifier
            .height(38.dp)
            .width(56.dp),
    ) {
        ColumnFillInCard {
            TextCenteredInCard(time)
        }
    }
}

@Preview
@Composable
fun CardTimeItemPreview() {
    CardTimeItem("10:00")
}