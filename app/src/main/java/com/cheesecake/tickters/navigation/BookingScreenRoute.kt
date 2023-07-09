package com.cheesecake.tickters.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.tickters.screens.BookingScreen.BookingScreen
import com.cheesecake.tickters.screens.Home.HomeScreen


private const val ROUTE = "BookingScreen"

fun NavController.navigateToBookingScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.bookingScreenRoute(navController: NavController) {
    composable(
        route = ROUTE

    ) { BookingScreen(navController) }
}
