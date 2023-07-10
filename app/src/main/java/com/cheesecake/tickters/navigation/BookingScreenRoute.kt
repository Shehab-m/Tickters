package com.cheesecake.tickters.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.tickters.presentation.booking.BookingScreen

fun NavController.navigateToBookingScreen() {
    navigate(ScreensRoute.Booking.route)
}

fun NavGraphBuilder.bookingScreenRoute(navController: NavController) {
    composable(
        route = ScreensRoute.Booking.route

    ) { BookingScreen(navController) }
}
