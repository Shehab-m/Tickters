package com.cheesecake.tickters.screens.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

@Composable
fun ColumnSeats(rowsNum: Int, rotation: Float = 0f, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {

        items(rowsNum) {
            RowSeat(rotation)
        }


//
//        Row(modifier = Modifier.rotate(10f)) {
//            Box {
//                IconSeat(modifier = Modifier.padding(start = 38.dp))
//                IconSeat()
//            }
//        }
//
//
//        Row(modifier = Modifier.padding(top = 9.dp)) {
//            Box {
//                IconSeat(modifier = Modifier.padding(start = 38.dp))
//                IconSeat()
//            }
//        }
//
//
//        Row(modifier = Modifier.rotate(-10f)) {
//            Box {
//                IconSeat()
//                IconSeat(modifier = Modifier.padding(start = 38.dp))
//            }
//        }


    }
}