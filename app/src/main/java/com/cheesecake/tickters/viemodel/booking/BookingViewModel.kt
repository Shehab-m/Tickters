package com.cheesecake.tickters.viemodel.booking

import com.cheesecake.tickters.dataSource.Entity.Date
import com.cheesecake.tickters.base.BaseViewModel
import com.cheesecake.tickters.viemodel.booking.state.BookingUIState
import com.cheesecake.tickters.viemodel.booking.state.SeatState
import com.cheesecake.tickters.viemodel.booking.state.getNextState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor() : BaseViewModel<BookingUIState>(BookingUIState()),
    BookingScreenInteractions {

    private val dateItems = listOf(
        Date("11", "sun"),
        Date("12", "mon"),
        Date("13", "tue"),
        Date("14", "wed"),
        Date("15", "thu"),
        Date("16", "fri"),
        Date("17", "sat"),
        Date("18", "sun"),
        Date("19", "mon"),

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
                    Pair(SeatState.Taken, SeatState.Taken),
                    Pair(SeatState.Available, SeatState.Taken),
                    Pair(SeatState.Available, SeatState.Taken),
                    Pair(SeatState.Taken, SeatState.Available),
                    Pair(SeatState.Available, SeatState.Available),
                )
            )
        }
    }

    override fun onClickSeat(state: SeatState): SeatState {
        return state.getNextState()
    }

}