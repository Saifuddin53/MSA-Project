package com.myprojects.msa_project.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.myprojects.msa_project.R
import com.myprojects.msa_project.presentation.common.components.IconWithText
import com.myprojects.msa_project.presentation.shop_list.components.OrderButton

@Composable
fun HomeScreenContent(
    modifier: Modifier = Modifier,
    onSearchClick: () -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TypingText(text = "How's your hackathon going? Search for some pizza and juice nearby")

        Button(
            onClick = { onSearchClick() }
        ) {
            IconWithText(
                icon = R.drawable.search,
                text = "Search"
            )
        }
    }
}