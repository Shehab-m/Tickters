package com.cheesecake.tickters.ui.screens.Home

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cheesecake.tickters.dataSource.Entity.MovieType
import com.cheesecake.tickters.navigation.navigateToMovieDetails
import com.cheesecake.tickters.ui.screens.Home.composable.BottomSheetHome
import com.cheesecake.tickters.ui.screens.Home.composable.HomeContentHeader
import com.cheesecake.tickters.ui.screens.Home.composable.ImageBackground
import com.cheesecake.tickters.ui.screens.Home.composable.MoviePager
import com.cheesecake.tickters.ui.screens.composable.SpacerVertical60
import com.cheesecake.tickters.viemodel.home.state.HomeUIState
import com.cheesecake.tickters.ui.theme.White
import com.cheesecake.tickters.viemodel.home.HomeScreenInteractions
import com.cheesecake.tickters.viemodel.home.HomeViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(initialPage = state.movies.size / 2)
    HomeContent(state, viewModel, pagerState, onClickMovie = { position,type ->
        navController.navigateToMovieDetails(position,type)
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

            ImageBackground(state, pagerState)

            SpacerVertical60()
            HomeContentHeader(state, viewModel)

            MoviePager(
                modifier = Modifier
                    .padding(top = 120.dp)
                    .fillMaxWidth(),
                pagerState = pagerState,
                state = state,
                onClickMovie = onClickMovie,
            )

        }

        BottomSheetHome(state, pagerState.currentPage)
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}

