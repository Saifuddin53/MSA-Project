package com.myprojects.msa_project.presentation.shop_list

import com.myprojects.msa_project.domain.util.NetworkError

sealed interface ShopListEvent {
    data class Error(val error: NetworkError): ShopListEvent
}