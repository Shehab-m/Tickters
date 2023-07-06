package com.cheesecake.tickters.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavDestinations.Home.route){
        composable(route = BottomNavDestinations.Home.route){
            HomeScreen()
        }
        composable(route = BottomNavDestinations.Tickets.route){
            BookingScreen()
        }
    }
}