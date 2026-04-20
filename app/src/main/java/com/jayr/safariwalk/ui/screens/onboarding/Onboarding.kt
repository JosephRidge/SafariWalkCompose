package com.jayr.safariwalk.ui.screens.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.jayr.safariwalk.ui.navigation.ROUTES


@Composable
fun OnboardingScreen(navController: NavHostController, modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ){
        AsyncImage(
            model = "https://images.pexels.com/photos/36799582/pexels-photo-36799582.jpeg",
            contentDescription = "null",
        )
        OutlinedButton(
            onClick = {
                navController.navigate(ROUTES.Login.name)
            }
        ) {
            Text(
                text = "Get started(login page)"
            )
        }
    }

}