package com.cheesecake.tickters.screens.BookingScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cheesecake.tickters.R
import com.cheesecake.tickters.screens.BookingScreen.Composable.ImageHeaderCinema
import com.cheesecake.tickters.screens.composable.ButtonExit
import com.cheesecake.tickters.screens.BookingScreen.Composable.CardDateItem
import com.cheesecake.tickters.screens.BookingScreen.Composable.CardTimeItem
import com.cheesecake.tickters.screens.composable.ColumnSeats
import com.cheesecake.tickters.screens.composable.PrimaryButton
import com.cheesecake.tickters.screens.composable.RowIconText
import com.cheesecake.tickters.ui.theme.Black
import com.cheesecake.tickters.ui.theme.MediumGrey
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.TextGrey
import com.cheesecake.tickters.ui.theme.White
import com.cheesecake.tickters.viewmodel.BookingScreenInteractions
import com.cheesecake.tickters.viewmodel.BookingViewModel
import com.cheesecake.tickters.viewmodel.state.BookingUIState

@Composable
fun BookingScreen(
    navController: NavHostController,
    viewModel: BookingViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    BookingContent(state, viewModel) { navController.navigateUp() }
}

@Composable
fun BookingContent(
    state: BookingUIState,
    viewModel: BookingScreenInteractions,
    navigateUp: () -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        val (bottomSheet, imageBanner, rowGuide, rowSeats, buttonExit) = createRefs()

        ImageHeaderCinema(modifier = Modifier.constrainAs(imageBanner) {
            top.linkTo(parent.top, 58.dp)
        })


        Row(horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, end = 20.dp, start = 20.dp)
                .constrainAs(rowSeats) {
                    top.linkTo(imageBanner.bottom)
                    bottom.linkTo(rowGuide.top)
                }) {
            ColumnSeats(rows = state.seats, rotation = 10f)
            ColumnSeats(rows = state.seats, modifier = Modifier.padding(top = 9.dp))
            ColumnSeats(rows = state.seats, rotation = -10f)
        }


        Row(horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .constrainAs(rowGuide) {
                    bottom.linkTo(bottomSheet.top)
                    top.linkTo(rowSeats.bottom)
                }) {
            RowIconText(
                text = "Available",
                iconColor = White,
                painter = painterResource(id = R.drawable.dot_svgrepo_com)
            )
            RowIconText(
                text = "Taken",
                iconColor = MediumGrey,
                painter = painterResource(id = R.drawable.dot_svgrepo_com)
            )
            RowIconText(
                text = "Selected",
                iconColor = Orange,
                painter = painterResource(id = R.drawable.dot_svgrepo_com)
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
                .background(White)
                .constrainAs(bottomSheet) {
                    bottom.linkTo(parent.bottom)
                }) {

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

        ButtonExit(
            modifier = Modifier.constrainAs(buttonExit) {
                top.linkTo(parent.top, 46.dp)
                start.linkTo(parent.start, 16.dp)
            },
            onClick = navigateUp
        )

    }
}

@Preview
@Composable
fun BookingScreenPreview() {
    BookingScreen(rememberNavController())
}