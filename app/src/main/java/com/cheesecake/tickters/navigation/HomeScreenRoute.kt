package com.cheesecake.tickters.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.cheesecake.tickters.screens.Home.HomeScreen

private const val ROUTE = "HomeScreen"

fun NavController.navigateToHomeScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.homeScreenRoute(navController: NavController) {
    composable(
        route = ROUTE

    ) { HomeScreen(navController) }
}
