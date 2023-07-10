package com.cheesecake.tickters.presentation.home.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cheesecake.tickters.R
import com.cheesecake.tickters.dataSource.Entity.Movie
import com.cheesecake.tickters.presentation.composable.RowIconText
import com.cheesecake.tickters.presentation.composable.RowTagsChips
import com.cheesecake.tickters.presentation.composable.TextCentered
import com.cheesecake.tickters.presentation.home.viewModel.state.HomeUIState
import com.cheesecake.tickters.ui.theme.Black
import com.cheesecake.tickters.ui.theme.DarkGrey

@Composable
fun BottomSheetHome(movies: List<Movie>, page: Int) {
    RowIconText(
        text = movies[page].duration,
        iconColor = DarkGrey,
        textColor = Black,
        painter = painterResource(id = R.drawable.clock_svgrepo_com),
        modifier = Modifier.padding(top = 20.dp)
    )

    TextCentered(text = movies[page].title, size = 26.sp)

    RowTagsChips(items = movies[page].tags, modifier = Modifier.padding(top = 16.dp))

}