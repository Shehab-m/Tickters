package com.cheesecake.tickters.screens.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.theme.DarkGrey
import com.cheesecake.tickters.ui.theme.OnBackgroundColor

@Composable
fun MovieScreenHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 46.dp, end = 16.dp, start = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = {}, modifier = Modifier
                .clip(CircleShape)
                .size(38.dp)
                .background(DarkGrey)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.close_circle_1_svgrepo_com),
                contentDescription = "Exit",
                tint = OnBackgroundColor,
                modifier = Modifier.size(26.dp)
            )
        }
        TextWithIcon(
            "2h 23m",
            painterResource(id = R.drawable.clock_svgrepo_com),
        )
    }
}