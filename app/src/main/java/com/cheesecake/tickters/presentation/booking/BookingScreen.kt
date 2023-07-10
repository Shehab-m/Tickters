package com.cheesecake.tickters.presentation.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cheesecake.tickters.R
import com.cheesecake.tickters.presentation.booking.composable.BottomSheetBooking
import com.cheesecake.tickters.presentation.booking.composable.ImageHeader
import com.cheesecake.tickters.presentation.booking.composable.RowBookingGuide
import com.cheesecake.tickters.presentation.booking.composable.RowBookingSeats
import com.cheesecake.tickters.presentation.composable.ButtonExit
import com.cheesecake.tickters.presentation.booking.viewModel.state.BookingUIState
import com.cheesecake.tickters.ui.theme.Black
import com.cheesecake.tickters.presentation.booking.viewModel.BookingViewModel

@Composable
fun BookingScreen(
    navController: NavController,
    viewModel: BookingViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    BookingContent(state) { navController.navigateUp() }
}

@Composable
fun BookingContent(
    state: BookingUIState,
    navigateUp: () -> Unit
) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        val (bottomSheet, imageBanner, rowGuide, rowSeats, buttonExit) = createRefs()

        ImageHeader(
            painterResource(id = R.drawable.img_3),
            modifier = Modifier.constrainAs(imageBanner) {
                top.linkTo(parent.top, 62.dp)
            })

        RowBookingSeats(state, modifier = Modifier.constrainAs(rowSeats) {
            top.linkTo(imageBanner.bottom)
            bottom.linkTo(rowGuide.top)
        })

        RowBookingGuide(modifier = Modifier.constrainAs(rowGuide) {
            bottom.linkTo(bottomSheet.top)
            top.linkTo(rowSeats.bottom)
        })

        BottomSheetBooking(state, modifier = Modifier.constrainAs(bottomSheet) {
            bottom.linkTo(parent.bottom)
        })

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