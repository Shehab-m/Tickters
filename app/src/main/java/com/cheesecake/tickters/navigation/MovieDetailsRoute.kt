package com.cheesecake.tickters.navigation

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.cheesecake.tickters.navigation.MovieDetailsArgs.Companion.ID_ARG
import com.cheesecake.tickters.navigation.MovieDetailsArgs.Companion.TYPE_ARG
import com.cheesecake.tickters.screens.MovieDetailsScreen
import com.cheesecake.tickters.viewmodel.model.MovieType

fun NavController.navigateTOMovieDetails(id: Int,type:String) {
    navigate("$ROUTE/$id/$type")
}

private const val ROUTE = "MovieDetailsScreen"
fun NavGraphBuilder.movieDetailsRoute(navController: NavController) {
    composable(
        route = "$ROUTE/{$ID_ARG}/{$TYPE_ARG}",

        arguments = listOf(
            navArgument(ID_ARG) { NavType.StringType },
            navArgument(TYPE_ARG) { NavType.StringType },
        )
    ) { MovieDetailsScreen(navController) }
}

class MovieDetailsArgs(savedStateHandle: SavedStateHandle) {
    val id: String = savedStateHandle[ID_ARG] ?: "0"
    val type: String = savedStateHandle[TYPE_ARG] ?: ""

    companion object {
        const val ID_ARG = "id"
        const val TYPE_ARG = "type"
    }
}


