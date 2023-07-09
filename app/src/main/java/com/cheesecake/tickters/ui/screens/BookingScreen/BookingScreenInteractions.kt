package com.cheesecake.tickters.ui.screens.BookingScreen

import com.cheesecake.tickters.ui.state.SeatState

interface BookingScreenInteractions {
    fun onClickSeat(state: SeatState): SeatState
}