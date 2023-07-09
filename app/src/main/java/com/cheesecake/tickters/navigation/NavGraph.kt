package com.cheesecake.tickters.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cheesecake.tickters.screens.BookingScreen.BookingScreen
import com.cheesecake.tickters.screens.Home.HomeScreen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ScreensRoute.Home.route) {
        homeScreenRoute(navController)
        bookingScreenRoute(navController)
        movieDetailsRoute(navController)
    }
}


