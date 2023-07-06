package com.cheesecake.tickters.screens

import com.cheesecake.tickters.R

sealed class BottomNavDestinations(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : BottomNavDestinations(
        route = "homeScreen",
        title = "Home",
        icon = R.drawable.movie_videos_svgrepo_com
    )
   object Search : BottomNavDestinations(
        route = "search",
        title = "Search",
        icon = R.drawable.search_4_svgrepo_com
    )
   object Tickets : BottomNavDestinations(
        route = "bookingScreen",
        title = "Tickets",
        icon = R.drawable.ticket_svgrepo_com
    )
   object Profile : BottomNavDestinations(
        route = "profile",
        title = "Profile",
        icon = R.drawable.profile_1341_svgrepo_com
    )

}