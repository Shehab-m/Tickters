package com.cheesecake.tickters.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.cheesecake.tickters.R
import com.cheesecake.tickters.screens.composable.ImageActorItem
import com.cheesecake.tickters.screens.composable.MovieScreenHeader
import com.cheesecake.tickters.screens.composable.PrimaryButton
import com.cheesecake.tickters.screens.composable.RowTagsChips
import com.cheesecake.tickters.screens.composable.SpacerVertical16
import com.cheesecake.tickters.screens.composable.TextCentered
import com.cheesecake.tickters.screens.composable.TextRating
import com.cheesecake.tickters.ui.theme.Orange
import com.cheesecake.tickters.ui.theme.White
import com.cheesecake.tickters.viewmodel.MovieDetailsViewModel
import com.cheesecake.tickters.viewmodel.state.MovieDetailsUIState


@Composable
fun MovieDetailsScreen(
    viewModel: MovieDetailsViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    MovieDetailsContent(state)

}

@Composable
fun MovieDetailsContent(state: MovieDetailsUIState) {
    Box(
        modifier = Modifier.fillMaxSize()

    ) {

        Box {
            Image(
                painter = rememberAsyncImagePainter(model = state.imageUrl),
                contentDescription = "Movie Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.5f),
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
                TextRating("6.8", "IMDb", "/10")
                TextRating("63%", "Rotten Tomatoes")
                TextRating("4", "IGN", "/10")
            }

            TextCentered(text = state.name, size = 26.sp)

            SpacerVertical16()

            RowTagsChips(state.tags)

            TextCentered(text = state.description, size = 14.sp)

            SpacerVertical16()

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 24.dp),
            ) {
                items(state.itemsCast) {
                    ImageActorItem(it)
                }
            }

            PrimaryButton(text = "Booking", modifier = Modifier.padding(vertical = 16.dp))

        }

    }
}

@Preview
@Composable
fun PreviewMovieScreen() {
    MovieDetailsScreen()
}
