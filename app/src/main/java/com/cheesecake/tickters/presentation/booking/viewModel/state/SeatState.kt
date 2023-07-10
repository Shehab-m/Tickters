package com.cheesecake.tickters.presentation.booking.viewModel.state

enum class SeatState {
    Available, Taken, Selected
}

fun SeatState.getNextState(): SeatState {
    return when(this){
        SeatState.Available -> SeatState.Selected
        SeatState.Taken -> SeatState.Taken
        SeatState.Selected -> SeatState.Available
    }
}
