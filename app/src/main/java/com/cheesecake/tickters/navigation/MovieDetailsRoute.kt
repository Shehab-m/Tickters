package com.cheesecake.tickters.navigation

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.cheesecake.tickters.dataSource.Entity.MovieType
import com.cheesecake.tickters.navigation.MovieDetailsArgs.Companion.ID_ARG
import com.cheesecake.tickters.navigation.MovieDetailsArgs.Companion.TYPE_ARG
import com.cheesecake.tickters.presentation.movieDetails.MovieDetailsScreen

fun NavController.navigateToMovieDetails(id: Int, type: MovieType) {
    navigate("$ROUTE/$id/$type")
}

private const val ROUTE = "MovieDetailsScreen"
fun NavGraphBuilder.movieDetailsRoute(navController: NavController) {
    composable(
        route = "$ROUTE/{$ID_ARG}/{$TYPE_ARG}",

        arguments = listOf(
            navArgument(ID_ARG) { type = NavType.IntType },
            navArgument(TYPE_ARG) { type = NavType.EnumType(MovieType::class.java) },
        )
    ) { MovieDetailsScreen(navController) }
}

class MovieDetailsArgs(savedStateHandle: SavedStateHandle) {
    val id: Int = checkNotNull(savedStateHandle.get<Int>(ID_ARG))
    val type: MovieType = savedStateHandle.get<MovieType>(TYPE_ARG) ?: MovieType.NOW_SHOWING

    companion object {
        const val ID_ARG = "id"
        const val TYPE_ARG = "type"
    }
}
