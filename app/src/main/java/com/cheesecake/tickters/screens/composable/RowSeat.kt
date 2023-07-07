package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.viewmodel.state.SeatState
import com.cheesecake.tickters.viewmodel.state.getNextState

@Composable
fun RowSeat(
    rotation: Float = 0f,
    seatsState: Pair<SeatState, SeatState>,
) {
    Box() {

        var state by remember {
            mutableStateOf(seatsState)
        }

        Row(
            modifier = Modifier
                .rotate(rotation)
                .padding(vertical = 8.dp)
        ) {
            IconSeat(
                state = state.first,
                onClick = { state = state.copy(first = state.first.getNextState()) })
            IconSeat(
                state = state.second,
                onClick = { state = state.copy(second = state.second.getNextState()) })
        }
    }
}

@Preview
@Composable
fun RowSeatPreview(rotation: Float = 0f) {
    Box() {
        Row(
            modifier = Modifier
                .rotate(rotation)
                .padding(vertical = 8.dp)
        ) {
            IconSeat()
            IconSeat()

        }
    }
}