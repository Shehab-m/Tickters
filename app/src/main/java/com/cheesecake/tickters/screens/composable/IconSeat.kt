package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.theme.DarkGrey

@Composable
fun IconSeat(modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier.size(40.dp),
        painter = painterResource(id = R.drawable.seat),
        contentDescription = "seat",
        tint = DarkGrey,
    )
}