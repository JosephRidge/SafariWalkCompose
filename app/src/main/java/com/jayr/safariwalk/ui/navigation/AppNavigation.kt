package com.jayr.safariwalk.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jayr.safariwalk.ui.screens.authentication.login.LoginScreen
import com.jayr.safariwalk.ui.screens.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier){

    NavHost(
        navController = navController,
        startDestination = ROUTES.Onboarding.name
    ) {
        composable(ROUTES.Onboarding.name){ OnboardingScreen(navController, modifier) }
        composable(ROUTES.Login.name) { LoginScreen(navController, modifier) }
        composable(ROUTES.ForgotPassword.name) {   }
        composable(ROUTES.Register.name) {   }
        composable(ROUTES.Home.name) {   }
    }

}