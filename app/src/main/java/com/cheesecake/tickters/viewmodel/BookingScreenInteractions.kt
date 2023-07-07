package com.cheesecake.tickters.viewmodel

import com.cheesecake.tickters.viewmodel.state.SeatState

interface BookingScreenInteractions {
    fun onClickSeat(state: SeatState): SeatState
}