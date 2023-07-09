package com.cheesecake.tickters.ui.screens.MovieDetails.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.cheesecake.tickters.ui.theme.Black
import com.cheesecake.tickters.ui.theme.TextGrey

@Composable
fun TextRating(
    rating: String,
    ratingOf: String = "",
    site: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = buildAnnotatedString {
                withStyle(SpanStyle(color = Black)) {
                    append(rating)
                }
                if (rating.isNotEmpty()){
                    withStyle(SpanStyle(color = TextGrey)) {
                        append(ratingOf)
                    }
                }
            },
            fontSize = 18.sp,
        )
        Text(
            text = site,
            fontSize = 16.sp,
            color = TextGrey,
        )
    }

}
//
//Column(horizontalAlignment = Alignment.CenterHorizontally) {
//    Row {
//        Text(text = rating, fontSize = (18.sp))
//        if (maxRate.isNotEmpty()) Text(text = maxRate, color = TextGrey, fontSize = (18.sp))
//    }
//    Text(text = site, color = TextGrey, fontSize = (16.sp))
//}