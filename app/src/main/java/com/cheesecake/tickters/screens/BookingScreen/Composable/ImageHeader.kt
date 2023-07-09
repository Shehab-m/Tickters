package com.cheesecake.tickters.screens.BookingScreen.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImageHeader(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = painter,
        contentDescription = "Cinema",
        contentScale = ContentScale.FillBounds,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(.15f)
    )
}
//
//@Composable
//fun ImageHeaderCinemas(modifier: Modifier = Modifier) {
//    Box(modifier = modifier.fillMaxWidth()) {
//        BoxWithConstraints(modifier = Modifier.fillMaxHeight(.12f)) {
//            val curveHeight = maxHeight * 0.2f // Adjust the curve height as per your needs
//
//            val path = Path().apply {
//                moveTo(0f, 0f)
//                quadraticBezierTo(maxWidth / 2f, curveHeight, maxWidth, 0f)
//                lineTo(maxWidth, maxHeight)
//                lineTo(0f, maxHeight)
//                close()
//            }
//            clipPath(path = path) {
//                this@drawWithContent.drawContent()
//            }
//
//        }
//
//        Image(
//            painter = painterResource(id = R.drawable.img_2),
//            contentDescription = "Cinema",
//            contentScale = ContentScale.FillBounds,
//            modifier = Modifier.fillMaxSize()
//        )
//    }
//}

