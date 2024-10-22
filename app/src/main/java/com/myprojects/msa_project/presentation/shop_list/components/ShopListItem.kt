package com.myprojects.msa_project.presentation.shop_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.myprojects.msa_project.R
import com.myprojects.msa_project.domain.Shop
import com.myprojects.msa_project.ui.theme.Typography

@Composable
fun DetailScreenFoodItem(
    shopItem: Shop
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xffF5F5F5)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            ) {
                Column(
                    modifier = Modifier.weight(0.76f),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = shopItem.name,
                        style = Typography.bodyLarge.copy(
                            fontWeight = FontWeight(600),
                            fontSize = 14.sp,
                            letterSpacing = 1.sp,
                            color = Color.Black
                        ),
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "4.5",
                            style = Typography.bodyMedium.copy(
                                fontSize = 9.sp,
                                fontWeight = FontWeight(500),
                                color = Color.White,
                            ),
                            modifier = Modifier
                                .padding(top = 2.dp, end = 6.dp)
                                .background(
                                    color = Color(0xff339D3A),
                                    shape = RoundedCornerShape(4.dp)
                                )
                                .padding(horizontal = 5.dp, vertical = 2.dp)
                        )

                        Text(
                            text = "500 Rating",
                            style = Typography.bodyMedium.copy(
                                fontWeight = FontWeight(500),
                                color = Color(0xff595959),
                                fontSize = 10.sp
                            ),
                            modifier = Modifier.align(Alignment.Bottom)
                        )
                    }
                    Row {
                        Icon(
                            painter = painterResource(id = R.drawable.distance),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp),
                            tint = Color(0xff595959),
                        )
                        Text(
                            text = shopItem.address,
                            style = Typography.bodyMedium.copy(
                                color = Color(0xff595959),
                                fontSize = 10.sp,
                                lineHeight = 14.sp
                            ),
                            modifier = Modifier.padding(horizontal = 10.dp) // Adjust padding if needed
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .height(70.dp)
                        .padding(end = 8.dp, bottom = 6.dp)
                        .clickable { /* TODO */ }
                        .weight(0.24f),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFffffff),
                        contentColor = Color.Black,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.White
                    ),
                    shape = RoundedCornerShape(10.dp),
                ) {
                    AsyncImage(
                        model = shopItem.imageUrl,
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .border(1.dp, Color(0xff797979), shape = RoundedCornerShape(24.dp))
                        .clickable {
                            // TODO : HANDLE NAVIGATION TO DIRECTION SCREEN
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.order_food),
                            contentDescription = "",
                            modifier = Modifier.size(16.dp)
                        )

                        Text(
                            text = "Order",
                            style = Typography.bodyMedium.copy(
                                fontWeight = FontWeight(500),
                                color = Color.Black,
                                fontSize = 10.sp
                            ),
                        )
                    }
                }
            }
        }
    }
}