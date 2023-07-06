package com.cheesecake.tickters.screens

import com.cheesecake.tickters.R

sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : BottomNavScreen(
        route = "homeScreen",
        title = "Home",
        icon = R.drawable.movie_videos_svgrepo_com
    )
   object Search : BottomNavScreen(
        route = "search",
        title = "Search",
        icon = R.drawable.search_4_svgrepo_com
    )
   object Tickets : BottomNavScreen(
        route = "bookingScreen",
        title = "Tickets",
        icon = R.drawable.ticket_svgrepo_com
    )
   object Profile : BottomNavScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.profile_1341_svgrepo_com
    )

}