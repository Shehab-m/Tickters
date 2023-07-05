package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import com.cheesecake.tickters.ui.theme.TextGrey

@Composable
fun TextRating(rating: String, site: String ,maxRate:String= "") {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Text(text = rating, fontSize = (18.sp))
            if (maxRate.isNotEmpty()) Text(text = maxRate, color = TextGrey,fontSize = (18.sp))
        }
        Text(text = site, color = TextGrey,fontSize = (16.sp))
    }
}