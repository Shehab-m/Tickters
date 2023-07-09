package com.cheesecake.tickters.ui.screens.Booking.Composable

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.screens.composable.CreateIndication
import com.cheesecake.tickters.ui.screens.composable.CreateMutableInteractionSource
import com.cheesecake.tickters.viemodel.booking.state.SeatState
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.White

@Composable
fun IconSeat(
    modifier: Modifier = Modifier,
    state: SeatState = SeatState.Available,
    onClick: () -> Unit = {}
) {

    val tintColor = animateColorAsState(
        targetValue = when (state) {
            SeatState.Available -> White
            SeatState.Taken -> DarkGray
            SeatState.Selected -> Orange
        }
    )
    Box(
        Modifier.clickable(
            interactionSource = CreateMutableInteractionSource(),
            indication = CreateIndication(),
            onClick = onClick
        )
    ) {
        Icon(
            modifier = modifier.size(44.dp),
            painter = painterResource(id = R.drawable.seat),
            contentDescription = "seat",
            tint = tintColor.value,
        )
    }
}

@Preview
@Composable
fun IconSeatPreview() {
    IconSeat()
}