package com.cheesecake.tickters.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.tickters.presentation.home.HomeScreen


fun NavController.navigateToHomeScreen() {
    navigate(ScreensRoute.Home.route)
}

fun NavGraphBuilder.homeScreenRoute(navController: NavController) {
    composable(
        route = ScreensRoute.Home.route

    ) { HomeScreen(navController) }
}
