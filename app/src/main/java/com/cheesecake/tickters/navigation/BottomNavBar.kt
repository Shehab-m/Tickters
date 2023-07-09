package com.cheesecake.tickters.navigation

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.cheesecake.tickters.ui.theme.Orange


@Composable
fun BottomNavBar(navController: NavHostController) {
    val screens = listOf(
        ScreensRoute.Home,
        ScreensRoute.Search,
        ScreensRoute.Booking,
        ScreensRoute.Profile,

        )
    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination
    Row(
        modifier = Modifier
            .padding(vertical = 20.dp, horizontal = 24.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        screens.forEach { screen ->
            fun onClick() {
                when (screen.route) {
                    ScreensRoute.Home.route -> {
                        navController.navigateToHomeScreen()
                    }

                    ScreensRoute.Booking.route -> {
                        navController.navigateToBookingScreen()
                    }

                    else -> {}
                }
            }
            AddRoute(
                screen = screen,
                currentDestination = currentDestination,
                onClick = ::onClick
            )
        }
    }

}

@Composable
fun RowScope.AddRoute(
    screen: ScreensRoute,
    currentDestination: NavDestination?,
    onClick: () -> Unit
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
    val background by animateColorAsState(targetValue = if (selected) Orange else Color.Transparent)
    val contentColor by animateColorAsState(targetValue = if (selected) Color.White else Color.Black)

    Box(
        modifier = Modifier
            .size(50.dp)
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = onClick)
    ) {
        Icon(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 10.dp)
                .matchParentSize(),
            painter = painterResource(id = screen.icon),
            contentDescription = "icon",
            tint = contentColor
        )
    }
}