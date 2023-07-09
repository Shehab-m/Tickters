package com.cheesecake.tickters.ui.screens.BookingScreen.state

import com.cheesecake.tickters.repository.Entity.Date
import com.cheesecake.tickters.ui.screens.BookingScreen.state.SeatState

data class BookingUIState(
    val bookingDateItems: List<Date> = emptyList(),
    val timeItems: List<String> = emptyList(),
    val price: Double = 0.0,
    val availableTickets: Int = 0,
    val seats: List<Pair<SeatState, SeatState>> = emptyList()
)