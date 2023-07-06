package com.cheesecake.tickters.viewmodel

import com.cheesecake.tickters.viewmodel.state.BookingUIState
import com.cheesecake.tickters.viewmodel.state.DateUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor(): BaseViewModel<BookingUIState>(BookingUIState()) {

    private val dateItems = listOf(
        DateUIState("17", "sun"),
        DateUIState("17", "sun"),
        DateUIState("17", "sun"),
        DateUIState("17", "sun"),
        DateUIState("17", "sun"),
        DateUIState("17", "sun"),
        DateUIState("17", "sun"),

    )
    private val timeItems = listOf("10:00", "10:00", "10:00", "10:00", "10:00", "10:00", "10:00")

    init {
        _state.update {
            it.copy(
                bookingDateItems = dateItems,
                timeItems = timeItems,
                price = 100.00,
                availableTickets = 4
            )
        }
    }

}