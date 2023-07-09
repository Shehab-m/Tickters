package com.cheesecake.tickters.ui.screens.Booking.Composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.viemodel.booking.state.BookingUIState
import com.cheesecake.tickters.ui.screens.composable.ColumnSeats

@Composable
fun RowBookingSeats(state: BookingUIState, modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, end = 20.dp, start = 20.dp)
    ) {
        ColumnSeats(rows = state.seats, rotation = 11f)
        ColumnSeats(rows = state.seats, modifier = Modifier.padding(top = 10.dp))
        ColumnSeats(rows = state.seats, rotation = -11f)
    }
}