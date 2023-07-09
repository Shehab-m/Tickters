package com.cheesecake.tickters.viemodel.booking

import com.cheesecake.tickters.viemodel.booking.state.SeatState

interface BookingScreenInteractions {
    fun onClickSeat(state: SeatState): SeatState
}