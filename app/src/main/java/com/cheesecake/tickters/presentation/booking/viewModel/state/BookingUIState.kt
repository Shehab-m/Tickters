package com.cheesecake.tickters.presentation.booking.viewModel.state

import com.cheesecake.tickters.dataSource.Entity.Date

data class BookingUIState(
    val bookingDateItems: List<Date> = emptyList(),
    val timeItems: List<String> = emptyList(),
    val price: Double = 0.0,
    val availableTickets: Int = 0,
    val seats: List<Pair<SeatState, SeatState>> = emptyList()
)