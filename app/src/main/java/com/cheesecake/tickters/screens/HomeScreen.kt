package com.cheesecake.tickters.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.cheesecake.tickters.viewmodel.HomeViewModel
import com.cheesecake.tickters.viewmodel.state.HomeUIState

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(state)
}

@Composable
fun HomeContent(state: HomeUIState) {

}





@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

