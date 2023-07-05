package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tickets.R

@Composable
fun MovieScreenHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 46.dp, end = 16.dp, start = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ButtonExit()
        TextWithIcon(
            "2h 23m",
            painterResource(id = R.drawable.clock_svgrepo_com),
        )
    }
}