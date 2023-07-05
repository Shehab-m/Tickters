package com.cheesecake.tickters.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.tickters.screens.composable.ButtonExit
import com.cheesecake.tickters.screens.composable.CardDateItem
import com.cheesecake.tickters.screens.composable.CardTimeItem
import com.cheesecake.tickters.screens.composable.ColumnSeats
import com.cheesecake.tickters.screens.composable.PrimaryButton
import com.cheesecake.tickters.screens.composable.RowIconText
import com.cheesecake.tickters.ui.theme.Black
import com.cheesecake.tickters.ui.theme.MediumGrey
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.TextGrey
import com.cheesecake.tickters.ui.theme.White
import com.cheesecake.tickters.viewmodel.BookingViewModel
import com.cheesecake.tickters.viewmodel.state.BookingUIState
import com.example.tickets.R

@Composable
fun BookingScreen(
    viewModel: BookingViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    BookingContent(state)
}

@Composable
fun BookingContent(state: BookingUIState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {

        Box(modifier = Modifier.weight(2f)) {

            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription = "Cinema",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 58.dp)
                        .fillMaxHeight(.1f)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, end = 20.dp, start = 20.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    ColumnSeats(rowsNum = 5, rotation = 10f)
                    ColumnSeats(rowsNum = 5, modifier = Modifier.padding(top = 9.dp))
                    ColumnSeats(rowsNum = 5, rotation = -10f)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    RowIconText(text = "Available", iconColor = White)
                    RowIconText(text = "Taken", iconColor = MediumGrey)
                    RowIconText(text = "Selected", iconColor = Orange)
                }


            }
            ButtonExit(modifier = Modifier.padding(top = 24.dp, start = 24.dp))

        }



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
                .background(White)
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                contentPadding = PaddingValues(end = 24.dp, start = 24.dp, top = 24.dp)
            ) {
                items(state.bookingDateItems) {
                    CardDateItem(date = it.date, day = it.day)
                }
            }

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                contentPadding = PaddingValues(horizontal = 24.dp)
            ) {
                items(state.timeItems) {
                    CardTimeItem(time = it)
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(text = "$ ${state.price}", fontSize = 24.sp)
                    Text(text = "${state.availableTickets} tickets", color = TextGrey)
                }

                PrimaryButton(text = "Buy tickets")
            }


        }


    }


}


@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen()
}