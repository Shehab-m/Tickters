package com.cheesecake.tickters.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cheesecake.tickters.screens.BookingScreen
import com.cheesecake.tickters.screens.BottomNavScreen
import com.cheesecake.tickters.screens.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavScreen.Home.route){
        composable(route = BottomNavScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomNavScreen.Tickets.route){
            BookingScreen()
        }
    }
}