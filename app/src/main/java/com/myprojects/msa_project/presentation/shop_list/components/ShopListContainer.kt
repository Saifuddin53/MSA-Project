package com.myprojects.msa_project.presentation.shop_list.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myprojects.msa_project.domain.Shop
import com.myprojects.msa_project.ui.theme.Typography

@Composable
fun ShopListContainer(
    shopList: List<Shop>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 20.dp)
            .offset(y = -(10.dp))
    ) {
        Text(
            text = "Pizza and juices nearby you ",
            style =  Typography.bodyLarge.copy(
                color = Color.Black,
                fontWeight = FontWeight(500),
                fontSize = 14.sp
            )
        )

        LazyColumn(
            modifier = Modifier
                .padding(top = 2.dp),
            contentPadding = PaddingValues(top = 8.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(shopList) { shop ->
                ShopListItem(
                    shop,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}