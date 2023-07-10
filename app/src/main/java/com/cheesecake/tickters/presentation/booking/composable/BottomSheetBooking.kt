package com.cheesecake.tickters.presentation.booking.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cheesecake.tickters.presentation.booking.viewModel.state.BookingUIState
import com.cheesecake.tickters.presentation.composable.PrimaryButton
import com.cheesecake.tickters.ui.theme.TextGrey
import com.cheesecake.tickters.ui.theme.White


@Composable
fun BottomSheetBooking(state: BookingUIState, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
            .background(White)
    ) {

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = PaddingValues(end = 24.dp, start = 24.dp, top = 24.dp)
        ) {
            items(state.bookingDateItems) {
                CardDateItem(date = it.date, day = it.day)
            }
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = PaddingValues(horizontal = 24.dp)
        ) {
            items(state.timeItems) {
                CardTimeItem(time = it)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "$ ${state.price}", fontSize = 24.sp)
                Text(text = "${state.availableTickets} tickets", color = TextGrey)
            }

            PrimaryButton(text = "Buy tickets")
        }
    }
}

