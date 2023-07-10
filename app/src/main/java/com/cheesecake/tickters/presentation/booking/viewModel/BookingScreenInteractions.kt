package com.cheesecake.tickters.presentation.booking.viewModel

import com.cheesecake.tickters.presentation.booking.viewModel.state.SeatState

interface BookingScreenInteractions {
    fun onClickSeat(state: SeatState): SeatState
}