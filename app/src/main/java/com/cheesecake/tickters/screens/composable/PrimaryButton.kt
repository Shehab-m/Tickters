package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.theme.Orange

@Composable
fun PrimaryButton(text: String,modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = Orange),
        contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
    ) {
        Icon(
            painter = painterResource(id = R.drawable.calender_svgrepo_com),
            contentDescription = null,
            modifier = Modifier.size(20.dp),
        )
        Text(text = text, fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
    }
}