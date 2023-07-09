package com.cheesecake.tickters.viemodel.booking.state

enum class CardState {
    SELECTED, NOT_SELECTED;
}

fun CardState.nextState(): CardState {
    return when(this) {
        CardState.NOT_SELECTED -> CardState.SELECTED
        CardState.SELECTED -> CardState.NOT_SELECTED
    }
}