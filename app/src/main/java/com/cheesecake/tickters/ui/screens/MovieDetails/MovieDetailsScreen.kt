package com.cheesecake.tickters.ui.screens.MovieDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.R
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.ButtonPlay
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.ImageMovie
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.RowItemsCast
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.TextRating
import com.cheesecake.tickters.ui.screens.MovieDetails.composable.TextWithIcon
import com.cheesecake.tickters.ui.screens.composable.ButtonExit
import com.cheesecake.tickters.ui.screens.composable.PrimaryButton
import com.cheesecake.tickters.ui.screens.composable.RowTagsChips
import com.cheesecake.tickters.ui.screens.composable.TextCentered
import com.cheesecake.tickters.ui.state.MovieDetailsUIState
import com.cheesecake.tickters.ui.theme.White

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

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 46.dp, end = 16.dp, start = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                ButtonExit(onClick = navigateUp)

                TextWithIcon(
                    "2h 23m",
                    painterResource(id = R.drawable.clock_svgrepo_com),
                )
            }

            ButtonPlay(modifier = Modifier.align(Alignment.Center))
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
                .background(White)
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                TextRating(rating = "6.8", ratingOf = "/10", site = "IMDb", )
                TextRating(rating = "63%", site = "Rotten Tomatoes")
                TextRating(rating = "4", ratingOf = "/10", site = "IGN", )
            }

            TextCentered(text = state.title, size = 26.sp)


            RowTagsChips(state.tags, modifier = Modifier.padding(top = 16.dp))

            TextCentered(text = state.description, size = 14.sp)

            RowItemsCast(items = state.itemsCast)

            PrimaryButton(text = "Booking", modifier = Modifier.padding(vertical = 16.dp))

        }

    }
}

@Preview
@Composable
fun PreviewMovieScreen() {
    MovieDetailsScreen(rememberNavController())
}
