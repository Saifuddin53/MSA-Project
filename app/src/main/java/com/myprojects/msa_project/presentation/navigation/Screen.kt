package com.myprojects.msa_project.presentation.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home_screen")
    data object ShopList : Screen("shop_list_screen")
}
