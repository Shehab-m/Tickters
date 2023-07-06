//package com.cheesecake.tickters.screens.composable
//
//import androidx.compose.animation.core.animateFloatAsState
//import androidx.compose.animation.core.tween
//import androidx.compose.foundation.ExperimentalFoundationApi
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.aspectRatio
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.pager.HorizontalPager
//import androidx.compose.foundation.pager.PagerState
//import androidx.compose.foundation.pager.rememberPagerState
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.BlurredEdgeTreatment
//import androidx.compose.ui.draw.blur
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.scale
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.unit.dp
//import coil.compose.rememberAsyncImagePainter
//
//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun App(list: List<String>) {
//    val pagerState = rememberPagerState(initialPage = list.size / 2)
//    var selectedImageUrl by remember { mutableStateOf(list[list.size / 2]) }
//
//    Box(modifier = Modifier.fillMaxSize()) {
//
//        Background(selectedImageUrl)
//
//        Column(modifier = Modifier.fillMaxWidth()) {
//            Spacer(modifier = Modifier.height(130.dp))
//
//            MoviePager(pagerState = pagerState) { imageUrl ->
//                selectedImageUrl = imageUrl
//            }
//        }
//    }
//}
//
//@Composable
//fun Background(imageUrl: String) {
//    Image(
//        painter = rememberAsyncImagePainter(model = imageUrl),
//        contentDescription = null,
//        contentScale = ContentScale.Crop,
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight(0.4f)
//            .blur(radius = 50.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded)
//    )
//}
//
//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun MoviePager(
//    pagerState: PagerState,
//    onItemSelected: (String) -> Unit,
//) {
//    val list = listOf<Int>()
//    HorizontalPager(
//        state = pagerState,
//        pageCount = list.size,
//        contentPadding = PaddingValues(horizontal = 64.dp),
//        modifier = Modifier.fillMaxWidth()
//    ) { page ->
//        val imageUrl =list[page % list.size]
//
//        onItemSelected("list[pagerState.currentPage]")
//
//        val animatedScale by animateFloatAsState(
//            targetValue = if (page == pagerState.currentPage) 1f else 0.8f,
//            animationSpec = tween(durationMillis = 200)
//        )
//
//        Image(painter = rememberAsyncImagePainter(model = imageUrl),
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .width(300.dp)
//                .height(400.dp)
//                .aspectRatio(3 / 4f)
//                .scale(animatedScale)
//                .clip(MaterialTheme.shapes.extraLarge)
//                .clickable { })
//    }
//
//}