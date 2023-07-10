package com.cheesecake.tickters.presentation.home

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.R
import com.cheesecake.tickters.dataSource.Entity.MovieType
import com.cheesecake.tickters.navigation.navigateToMovieDetails
import com.cheesecake.tickters.presentation.home.composable.BottomSheetHome
import com.cheesecake.tickters.presentation.home.composable.ButtonHomeContent
import com.cheesecake.tickters.presentation.home.composable.MoviePager
import com.cheesecake.tickters.presentation.home.viewModel.HomeScreenInteractions
import com.cheesecake.tickters.presentation.home.viewModel.HomeViewModel
import com.cheesecake.tickters.presentation.home.viewModel.state.HomeUIState
import com.cheesecake.tickters.ui.theme.White

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(initialPage = state.movies.size / 2)
    HomeContent(state, viewModel, pagerState, onClickMovie = { position, type ->
        navController.navigateToMovieDetails(position, type)
    })
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    state: HomeUIState,
    viewModel: HomeScreenInteractions,
    pagerState: PagerState,
    onClickMovie: (Int, MovieType) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Box {

            Image(
                modifier = Modifier
                    .blur(radius = 50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
                    .fillMaxWidth()
                    .fillMaxHeight(0.45f),
                contentScale = ContentScale.FillBounds,
                painter = rememberAsyncImagePainter(model = state.movies[pagerState.currentPage].imageUrl),
                contentDescription = stringResource(R.string.movie_background_image),
            )


            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp)
            ) {

                ButtonHomeContent(
                    buttonText = "Now Showing",
                    selected = state.homeContentType == HomeContentType.NowShowing,
                    onClick = { viewModel.updateHomeContent(HomeContentType.NowShowing) }
                )

                ButtonHomeContent(
                    buttonText = "Coming Soon",
                    selected = state.homeContentType == HomeContentType.ComingSoon,
                    onClick = { viewModel.updateHomeContent(HomeContentType.ComingSoon) }
                )

            }

            MoviePager(
                modifier = Modifier
                    .padding(top = 120.dp)
                    .fillMaxWidth(),
                pagerState = pagerState,
                movies = state.movies,
                onClickMovie = onClickMovie,
            )

        }

        BottomSheetHome(state.movies, pagerState.currentPage)
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}

