package com.cheesecake.tickters.screens.composable

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.cheesecake.tickters.ui.theme.DarkGrey
import com.example.tickets.R

@Composable
fun IconSeat(modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = R.drawable.seat),
        contentDescription = "seat",
        tint = DarkGrey,
    )
}