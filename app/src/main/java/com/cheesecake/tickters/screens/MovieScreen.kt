package com.cheesecake.tickters.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.R
import com.cheesecake.tickters.screens.elements.Chip
import com.cheesecake.tickters.screens.elements.MovieScreenHeader
import com.cheesecake.tickters.screens.elements.RowChips
import com.cheesecake.tickters.screens.elements.SpacerVertical16
import com.cheesecake.tickters.screens.elements.SpacerVertical36
import com.cheesecake.tickters.screens.elements.TextCentered
import com.cheesecake.tickters.screens.elements.TextRating
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

        Box {
            Image(
                painter = rememberAsyncImagePainter(model = state.imageUrl),
                contentDescription = "Movie Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(400.dp),
                contentScale = ContentScale.FillBounds,
            )

            MovieScreenHeader()

            IconButton(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.Center)
                    .clip(CircleShape)
                    .size(48.dp)
                    .background(Orange),

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.play_alt_svgrepo_com),
                    contentDescription = "Play",
                    tint = White,
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center)


                )
            }
        }


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(460.dp)
                .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
                .background(color = White)
                .align(Alignment.BottomCenter)
        ) {

            SpacerVertical36()

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                TextRating("6.8", "IMDb", "/10")
                TextRating("63%", "Rotten Tomatoes")
                TextRating("4", "IGN", "/10")
            }

            TextCentered(text = state.name, size = 26)

            SpacerVertical16()
            LazyRow(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                items(state.tags) {
                    Chip(text = it)
                }
            }

            TextCentered(text = state.description, size = 14)

            RowChips(items = state.itemsCast)

            Spacer(modifier = Modifier.weight(1f))

            SpacerVertical16()

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Orange),
                contentPadding = PaddingValues(vertical = 16.dp, horizontal = 20.dp),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.calender_svgrepo_com),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                )
                Text(text = "Booking", modifier = Modifier.padding(start = 8.dp))
            }
            SpacerVertical16()

        }

    }
}

@Preview
@Composable
fun PreviewMovieScreen() {
    MovieScreen()
}
