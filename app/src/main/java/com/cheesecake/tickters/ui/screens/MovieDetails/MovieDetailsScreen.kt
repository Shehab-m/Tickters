package com.cheesecake.tickters.ui.screens.MovieDetails

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.BottomSheetMovieDetails
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.ButtonPlay
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.ImageMovie
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.MovieDetailsHeader
import com.cheesecake.tickters.ui.screens.MovieDetails.state.MovieDetailsUIState

@Composable
fun MovieDetailsScreen(
    navController: NavController,
    viewModel: MovieDetailsViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    MovieDetailsContent(state) { navController.navigateUp() }
}

@Composable
fun MovieDetailsContent(state: MovieDetailsUIState, navigateUp: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()

    ) {

        Box {

            ImageMovie(painter = rememberAsyncImagePainter(model = state.imageUrl))

            MovieDetailsHeader(onExit = navigateUp)

            ButtonPlay(modifier = Modifier.align(Alignment.Center))
        }

        BottomSheetMovieDetails(state, modifier = Modifier.align(Alignment.BottomCenter))

    }
}

@Preview
@Composable
fun PreviewMovieScreen() {
    MovieDetailsScreen(rememberNavController())
}
