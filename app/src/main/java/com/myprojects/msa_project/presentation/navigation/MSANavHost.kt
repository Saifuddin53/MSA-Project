package com.myprojects.msa_project.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.myprojects.msa_project.presentation.home.HomeScreen
import com.myprojects.msa_project.presentation.shop_list.ShopListScreen

@Composable
fun MSANavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(
                onCategoryClick = {
                    navController.navigate(Screen.ShopList.route)
                },
                modifier = modifier
            )
        }

        composable(route = Screen.ShopList.route) {
            ShopListScreen(
                modifier = modifier
            )
        }
    }
}