package com.cheesecake.tickters.presentation.booking.composable

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cheesecake.tickters.presentation.composable.TextCenteredInCard
import com.cheesecake.tickters.presentation.booking.viewModel.state.CardState
import com.cheesecake.tickters.presentation.booking.viewModel.state.nextState
import com.cheesecake.tickters.ui.theme.DarkGrey
import com.cheesecake.tickters.ui.theme.White


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardDateItem(date: String, day: String) {

    var state by remember {
        mutableStateOf(CardState.NOT_SELECTED)
    }

    val containerColor by animateColorAsState(
        targetValue = when (state) {
            CardState.NOT_SELECTED -> White
            else -> DarkGrey
        }
    )
    val textColor by animateColorAsState(
        targetValue = when (state) {
            CardState.NOT_SELECTED -> DarkGrey
            else -> White
        }
    )

    Card(
        colors = CardDefaults.cardColors(containerColor),
        shape = RoundedCornerShape(24.dp),
        border = BorderStroke(1.dp, DarkGrey),
        modifier = Modifier
            .height(64.dp)
            .width(54.dp),
        onClick = { state = state.nextState() }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            TextCenteredInCard(text = date, textColor = textColor)
            TextCenteredInCard(text = day, textColor = textColor)
        }
    }

}

@Preview
@Composable
fun CardDateItemPreview() {
    CardDateItem("17", "sun")
}
