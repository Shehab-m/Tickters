package com.cheesecake.tickters.presentation.movieDetails.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cheesecake.tickters.presentation.movieDetails.viewModel.state.MovieDetailsUIState
import com.cheesecake.tickters.presentation.composable.PrimaryButton
import com.cheesecake.tickters.presentation.composable.RowTagsChips
import com.cheesecake.tickters.presentation.composable.TextCentered
import com.cheesecake.tickters.ui.theme.White


@Composable
fun BottomSheetMovieDetails(state: MovieDetailsUIState, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
            .background(White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextRating(rating = "6.8", ratingOf = "/10", site = "IMDb")
            TextRating(rating = "63%", site = "Rotten Tomatoes")
            TextRating(rating = "4", ratingOf = "/10", site = "IGN")
        }

        TextCentered(text = state.title, size = 26.sp)


        RowTagsChips(state.tags, modifier = Modifier.padding(top = 16.dp))

        TextCentered(text = state.description, size = 14.sp)

        RowItemsCast(items = state.itemsCast)

        PrimaryButton(text = "Booking", modifier = Modifier.padding(vertical = 16.dp))

    }
}