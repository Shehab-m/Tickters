package com.cheesecake.tickters.ui.screens.BookingScreen

import com.cheesecake.tickters.base.BaseViewModel
import com.cheesecake.tickters.screens.BookingScreen.BookingScreenInteractions
import com.cheesecake.tickters.ui.state.BookingUIState
import com.cheesecake.tickters.ui.state.SeatState
import com.cheesecake.tickters.viewmodel.state.DateUIState
import com.cheesecake.tickters.ui.state.getNextState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor() : BaseViewModel<BookingUIState>(BookingUIState()),
    BookingScreenInteractions {

    private val dateItems = listOf(
        DateUIState("11", "sun"),
        DateUIState("12", "mon"),
        DateUIState("13", "tue"),
        DateUIState("14", "wed"),
        DateUIState("15", "thu"),
        DateUIState("16", "fri"),
        DateUIState("17", "sat"),
        DateUIState("18", "sun"),
        DateUIState("19", "mon"),

        )
    private val timeItems = listOf("10:00", "13:00", "15:00", "18:00", "20:00", "24:00", "02:00", "04:00", "06:00")

    init {
        _state.update {
            it.copy(
                bookingDateItems = dateItems,
                timeItems = timeItems,
                price = 100.00,
                availableTickets = 4,
                seats = listOf(
                    Pair(SeatState.Selected, SeatState.Available),
                    Pair(SeatState.Available, SeatState.Taken),
                    Pair(SeatState.Selected, SeatState.Taken),
                    Pair(SeatState.Taken, SeatState.Available),
                    Pair(SeatState.Available, SeatState.Selected),
                )
            )
        }
    }

    override fun onClickSeat(state: SeatState): SeatState {
        return state.getNextState()
    }

}