package com.cheesecake.tickters.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.R
import com.cheesecake.tickters.screens.elements.Chip
import com.cheesecake.tickters.screens.elements.ImageItem
import com.cheesecake.tickters.screens.elements.MovieScreenHeader
import com.cheesecake.tickters.screens.elements.TextCentered
import com.cheesecake.tickters.screens.elements.TextRating
import com.cheesecake.tickters.screens.elements.TextWithIcon
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.White
import com.cheesecake.tickters.viewmodel.MovieViewModel
import com.cheesecake.tickters.viewmodel.state.MovieUIState


@Composable
fun MovieScreen(
    viewModel: MovieViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    MovieContent(state)

}

@Composable
fun MovieContent(state: MovieUIState) {
    Box(
        modifier = Modifier.fillMaxSize()

    ) {
        val screenHeight = with(LocalDensity.current) {
            LocalConfiguration.current.screenHeightDp.toDp()
        }
        Image(
            painter = painterResource(id = R.drawable.img_movie),
            contentDescription = "Movie Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(screenHeight * 1.8f),
            contentScale = ContentScale.FillBounds,
        )

        MovieScreenHeader()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(screenHeight * 2.1f)
                .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
                .background(color = White),
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 36.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                TextRating("6.8", "IMDb", "/10")
                TextRating("63%", "Rotten Tomatoes")
                TextRating("4", "IGN", "/10")
            }

            TextCentered(text = state.name, size = 26)

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                items(state.tags) {
                    Chip(text = it)
                }
            }

            TextCentered(text = state.description, size = 14, )

            Button(
                onClick = {},
                modifier = Modifier.padding(top = 24.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Orange)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.calender_svgrepo_com),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                )
                Text(text = "Booking", modifier = Modifier.padding(start = 4.dp))
            }

//
//            Image(
//                painter = rememberAsyncImagePainter(model = state.items.first()),
//                contentDescription = null,
//                modifier = Modifier.fillMaxSize()
//            )
//
//            LazyRow(
//                modifier = Modifier.padding(top = 24.dp),
//                horizontalArrangement = Arrangement.spacedBy(8.dp),
//                contentPadding = PaddingValues(horizontal = 16.dp),
//            ) {
//                items(state.items) {
//
//                    ImageItem(it)
//                }
//                Log.i("MovieContent: ", "insss")
//            }


        }


    }

}


@Preview
@Composable
fun PreviewMovieScreen() {
    MovieScreen()
}
