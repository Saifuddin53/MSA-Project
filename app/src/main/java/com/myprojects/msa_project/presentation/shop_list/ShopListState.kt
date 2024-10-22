package com.myprojects.msa_project.presentation.shop_list

import androidx.compose.runtime.Immutable
import com.myprojects.msa_project.domain.Shop

@Immutable
data class ShopListState(
    val isLoading: Boolean = false,
    val shops: List<Shop> = emptyList(),
    val selectedShop: Shop? = null
)