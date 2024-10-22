package com.myprojects.msa_project.presentation.shop_list.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myprojects.msa_project.R
import com.myprojects.msa_project.ui.theme.Typography

@Composable
fun OrderButton(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(start = 12.dp, top = 8.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Box(
            modifier = Modifier
                .border(1.dp, Color(0xff797979), shape = RoundedCornerShape(24.dp))
                .clickable {
                    // TODO : HANDLE NAVIGATION TO ORDER SCREEN
                }
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.order_food),
                    contentDescription = "",
                    modifier = Modifier.size(16.dp),
                    tint = Color.Black
                )

                Text(
                    text = "Order",
                    style = Typography.bodyMedium.copy(
                        fontWeight = FontWeight(500),
                        color = Color.Black,
                        fontSize = 14.sp
                    ),
                )
            }
        }
    }
}