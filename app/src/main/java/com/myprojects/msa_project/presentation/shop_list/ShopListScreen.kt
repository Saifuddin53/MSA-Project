package com.myprojects.msa_project.presentation.shop_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.myprojects.msa_project.presentation.shop_list.components.ShopListContainer
import com.myprojects.msa_project.presentation.shop_list.components.ShopListTopSection
import com.myprojects.msa_project.presentation.shop_list.components.ShopListItem
import org.koin.androidx.compose.koinViewModel

@Composable
fun ShopListScreen(
    viewModel: ShopListViewModel = koinViewModel(),
    modifier: Modifier,
    onBackClick: () -> Unit
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
        ) {
            ShopListTopSection() {
                onBackClick()
            }
            if(state.isLoading) {
                Box(
                    modifier = modifier
                        .weight(1f)
                        .background(Color.White)
                        .align(Alignment.CenterHorizontally),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            } else {
                ShopListContainer(
                    shopList = state.shops,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
        }
    }
}