package com.cheesecake.tickters.screens.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cheesecake.tickters.R
import com.cheesecake.tickters.navigation.navigateTOMovieDetails
import com.cheesecake.tickters.screens.composable.ImageBackground
import com.cheesecake.tickters.screens.composable.ButtonHomeContent
import com.cheesecake.tickters.screens.composable.Carousel
import com.cheesecake.tickters.screens.composable.RowIconText
import com.cheesecake.tickters.screens.composable.RowTagsChips
import com.cheesecake.tickters.screens.composable.TextCentered
import com.cheesecake.tickters.ui.theme.Black
import com.cheesecake.tickters.ui.theme.DarkGrey
import com.cheesecake.tickters.ui.theme.White
import com.cheesecake.tickters.viewmodel.HomeScreenInteractions
import com.cheesecake.tickters.viewmodel.HomeViewModel
import com.cheesecake.tickters.viewmodel.model.HomeContentType
import com.cheesecake.tickters.viewmodel.state.HomeUIState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(initialPage = state.movies.size / 2)
    HomeContent(state, viewModel, pagerState, navController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeContent(
    state: HomeUIState,
    viewModel: HomeScreenInteractions,
    pagerState: PagerState,
    navController: NavController
) {
    var selectedMovie by remember { mutableStateOf(state.movies[state.movies.size / 2]) }
    var selectedMovieId by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box {

            ImageBackground(selectedMovie.imageUrl)

            Carousel(
                modifier = Modifier
                    .padding(top = 120.dp)
                    .fillMaxWidth(),
                pagerState = pagerState,
                items = state.movies,
                onClickItem = {
                    navController.navigateTOMovieDetails(
                        selectedMovieId,
                        selectedMovie.type.toString()
                    )
                },
                onShowingItem = { movie, id ->
                    selectedMovie = movie
                    selectedMovieId = id
                }
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
        }

        RowIconText(
            text = selectedMovie.duration,
            iconColor = DarkGrey,
            textColor = Black,
            painter = painterResource(id = R.drawable.clock_svgrepo_com),
            modifier = Modifier.padding(top = 20.dp)
        )

        TextCentered(text = selectedMovie.title, size = 26.sp)

        RowTagsChips(items = selectedMovie.tags, modifier = Modifier.padding(top = 16.dp))


    }

}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}

