package com.divazahra0070.asesmen2mobpro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.divazahra0070.asesmen2mobpro.screen.DetailScreen
import com.divazahra0070.asesmen2mobpro.screen.KEY_ID_FILM
import com.divazahra0070.asesmen2mobpro.screen.MainScreen
import com.divazahra0070.asesmen2mobpro.screen.TrashScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            MainScreen(navController)
        }
        composable(route = Screen.FormBaru.route) {
            DetailScreen(navController)
        }
        composable(
            route = Screen.FormUbah.route,
            arguments = listOf(
                navArgument(KEY_ID_FILM) { type = NavType.LongType }
            )
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_FILM)
            DetailScreen(navController, id)
        }
        composable(route = Screen.TrashScreen.route) {
            TrashScreen(navController)
        }
    }
}