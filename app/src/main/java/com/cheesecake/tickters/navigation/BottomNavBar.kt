package com.cheesecake.tickters.navigation

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
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.cheesecake.tickters.ui.theme.Orange


@Composable
fun BottomNavBar(navController: NavHostController) {
    val screens = listOf(
        ScreensRoute.Home,
        ScreensRoute.Search,
        ScreensRoute.Tickets,
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
                        navController.navigate(ScreensRoute.Home.route) {
                            popUpTo(navController.graph.findStartDestination().id)
                            launchSingleTop = true
                        }
                    }

                    ScreensRoute.Tickets.route -> {
                        navController.navigate(ScreensRoute.Tickets.route) {
                            popUpTo(navController.graph.findStartDestination().id)
                            launchSingleTop = true
                        }
                    }

                    else -> {}
                }
            }
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController,
                onClick = ::onClick
            )
        }
    }

}

@Composable
fun RowScope.AddItem(
    screen: ScreensRoute,
    currentDestination: NavDestination?,
    navController: NavHostController,
    onClick: () -> Unit
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
    val background = if (selected) Orange else Color.Transparent
    val contentColor = if (selected) Color.White else Color.Black
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