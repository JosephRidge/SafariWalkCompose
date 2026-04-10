package com.jayr.safariwalk.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LottieAnimationWidget(drawable:Int){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(drawable))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever
        )
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.size(250.dp)
    )
}
