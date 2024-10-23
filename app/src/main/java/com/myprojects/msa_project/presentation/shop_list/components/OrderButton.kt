package com.myprojects.msa_project.presentation.shop_list.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.myprojects.msa_project.R
import com.myprojects.msa_project.presentation.common.components.IconWithText

@Composable
fun OrderButton(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(start = 12.dp, top = 8.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    Color(0xff797979),
                    shape = RoundedCornerShape(24.dp)
                )
                .clickable {
                    // TODO : HANDLE NAVIGATION TO ORDER SCREEN
                }
        ) {
            IconWithText(
                icon = R.drawable.order_food,
                text = "Order",
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}