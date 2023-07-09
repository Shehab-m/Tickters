    package com.cheesecake.tickters.navigation

    import com.cheesecake.tickters.R

    sealed class ScreensRoute(
        val route: String,
        val title: String,
        val icon: Int
    ) {
        object Home : ScreensRoute(
            route = "homeScreen",
            title = "Home",
            icon = R.drawable.movie_videos_svgrepo_com
        )
       object Search : ScreensRoute(
            route = "search",
            title = "Search",
            icon = R.drawable.search_4_svgrepo_com
        )
       object Booking : ScreensRoute(
            route = "bookingScreen",
            title = "Booking",
            icon = R.drawable.ticket_svgrepo_com
        )
       object Profile : ScreensRoute(
            route = "profile",
            title = "Profile",
            icon = R.drawable.profile_1341_svgrepo_com
        )


    }