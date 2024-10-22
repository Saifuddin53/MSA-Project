package com.myprojects.msa_project.presentation.shop_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myprojects.msa_project.domain.ShopDataSource
import com.myprojects.msa_project.domain.util.onError
import com.myprojects.msa_project.domain.util.onSuccess
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ShopListViewModel(
    private val shopDataSource: ShopDataSource
): ViewModel() {

    private val _state = MutableStateFlow(ShopListState())
    val state = _state
        .onStart { loadShops() }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000L),
            ShopListState()
        )

    private fun loadShops() {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    isLoading = true
                )
            }

            shopDataSource
                .getNearbyShops(
                    40.748817,
                    -73.985428,
                    "pizza,juice",
                    "2000"
                )
                .onSuccess { shops ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            shops = shops
                        )
                    }
                }
                .onError { error ->
                    _state.update { it.copy(isLoading = false) }
                }
        }
    }
}