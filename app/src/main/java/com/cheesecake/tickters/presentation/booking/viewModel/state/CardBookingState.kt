package com.cheesecake.tickters.presentation.booking.viewModel.state

enum class CardState {
    SELECTED, NOT_SELECTED;
}

fun CardState.nextState(): CardState {
    return when(this) {
        CardState.NOT_SELECTED -> CardState.SELECTED
        CardState.SELECTED -> CardState.NOT_SELECTED
    }
}