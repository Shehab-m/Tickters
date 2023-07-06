package com.cheesecake.tickters.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.tickters.screens.composable.Background
import com.cheesecake.tickters.screens.composable.MoviePager
import com.cheesecake.tickters.viewmodel.HomeViewModel
import com.cheesecake.tickters.viewmodel.state.HomeUIState

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(state)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(state: HomeUIState) {
    val pagerState = rememberPagerState(initialPage = state.movies.size / 2)
    var selectedImageUrl by remember { mutableStateOf(state.movies[state.movies.size / 2].imageUrl) }

    Box(modifier = Modifier.fillMaxSize()) {

        Background(selectedImageUrl)

        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.height(130.dp))

            MoviePager(pagerState = pagerState, state.movies.map { it.imageUrl }) { imageUrl ->
                selectedImageUrl = imageUrl
            }
        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

