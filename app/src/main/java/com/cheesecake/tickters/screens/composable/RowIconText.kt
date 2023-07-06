package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.theme.MediumGrey

@Composable
fun RowIconText(
    text: String,
    iconColor: Color,
    modifier: Modifier = Modifier
) {
    Row(

    ) {
        Icon(
            painter = painterResource(id = R.drawable.dot_svgrepo_com),
            contentDescription = "Dot",
            modifier = modifier.size(20.dp),
            tint = iconColor
        )
        Text(text = text, color = MediumGrey)
    }
}