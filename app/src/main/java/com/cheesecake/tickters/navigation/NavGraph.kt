package com.cheesecake.tickters.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cheesecake.tickters.ProfileScreen
import com.cheesecake.tickters.screens.BookingScreen
import com.cheesecake.tickters.screens.HomeScreen.HomeScreen
import com.cheesecake.tickters.screens.MovieDetailsScreen
import com.cheesecake.tickters.screens.SearchScreen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ScreensRoute.Home.route){
        composable(route = ScreensRoute.Home.route){
            HomeScreen(navController)
        }
        composable(route = ScreensRoute.Tickets.route){
            BookingScreen(navController)
        }
        composable(route = ScreensRoute.Search.route){
            SearchScreen(navController)
        }
        composable(route = ScreensRoute.Profile.route){
            ProfileScreen(navController)
        }
        movieDetailsRoute(navController)
    }
}