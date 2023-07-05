package com.cheesecake.tickters.viewmodel.state

data class BookingUIState(
    val bookingDateItems: List<DateUIState> = emptyList(),
    val timeItems: List<String> = emptyList(),
    val price: Double = 0.0,
    val availableTickets: Int = 0
)