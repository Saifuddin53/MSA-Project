package com.myprojects.msa_project.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import com.myprojects.msa_project.R
import com.myprojects.msa_project.ui.theme.MSAProjectTheme
import com.myprojects.msa_project.ui.theme.Ocean3
import com.myprojects.msa_project.ui.theme.Shadow2
import com.myprojects.msa_project.ui.theme.Shadow4
import kotlin.math.max

@Composable
fun HomeScreen(
    gradient: List<Color> = listOf(Shadow2, Ocean3, Shadow4),
    onCategoryClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = modifier
                .aspectRatio(1.45f)
                .shadow(elevation = 3.dp, shape = RoundedCornerShape(10.dp))
                .clip(RoundedCornerShape(10.dp))
                .background(Brush.horizontalGradient(gradient))
                .clickable {
                    onCategoryClick()
                }
        ) {
            Text(
                text = "Search for Pizza and Juice",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xfff9f9f9),
                modifier = Modifier
                    .weight(0.55f)
                    .padding(4.dp)
                    .padding(start = 8.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.screenshot_2024_10_21_202718),
                contentDescription = null,
                modifier = Modifier
                    .weight(0.45f)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(10.dp))
            )
        }
    }
}