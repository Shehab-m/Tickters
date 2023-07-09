package com.cheesecake.tickters.ui.screens.BookingScreen

import com.cheesecake.tickters.ui.screens.BookingScreen.state.SeatState

interface BookingScreenInteractions {
    fun onClickSeat(state: SeatState): SeatState
}