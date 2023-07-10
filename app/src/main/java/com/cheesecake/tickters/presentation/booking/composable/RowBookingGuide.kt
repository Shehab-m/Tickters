package com.cheesecake.tickters.presentation.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.presentation.composable.RowIconText
import com.cheesecake.tickters.ui.theme.MediumGrey
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.White

@Composable
fun RowBookingGuide(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        RowIconText(
            text = "Available",
            iconColor = White,
            painter = painterResource(id = R.drawable.dot_svgrepo_com)
        )
        RowIconText(
            text = "Taken",
            iconColor = MediumGrey,
            painter = painterResource(id = R.drawable.dot_svgrepo_com)
        )
        RowIconText(
            text = "Selected",
            iconColor = Orange,
            painter = painterResource(id = R.drawable.dot_svgrepo_com)
        )
    }
}