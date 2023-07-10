package com.cheesecake.tickters.presentation.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cheesecake.tickters.presentation.booking.composable.RowSeat
import com.cheesecake.tickters.presentation.booking.viewModel.state.SeatState

@Composable
fun ColumnSeats(
    rows: List<Pair<SeatState, SeatState>>,
    rotation: Float = 0f,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {

        items(rows) {
            RowSeat(seatsState = it, rotation = rotation,)
        }

    }
}