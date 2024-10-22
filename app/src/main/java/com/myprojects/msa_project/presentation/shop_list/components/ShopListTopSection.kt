package com.myprojects.msa_project.presentation.shop_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import com.myprojects.msa_project.R
import com.myprojects.msa_project.ui.theme.Typography

@Composable
fun ShopListTopSection(
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f)
    ) {
        AsyncImage(
            model = "https://media.istockphoto.com/id/187248625/photo/pepperoni-pizza.jpg?s=1024x1024&w=is&k=20&c=7A7_uRfvthKD3VZxM51xtBOeyISeXBhBgXrdOPLco68=",
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer { alpha = 1f },
            contentScale = ContentScale.FillWidth
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.35f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Pizza & Juices",
                style =  Typography.bodyLarge.copy(
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.W500
                ),
                textAlign = TextAlign.Center
            )
        }

        Surface(
            shape = CircleShape,
            modifier = Modifier
                .padding(start = 20.dp)
                .align(Alignment.CenterStart)
                .clickable {
                    onBackClick()
                },
            color = Color.White
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back),
                contentDescription = "",
                modifier = Modifier
                    .padding(10.dp)
                    .size(20.dp)
                    .align(Alignment.Center),
                tint = Color.Black
            )
        }
    }
}