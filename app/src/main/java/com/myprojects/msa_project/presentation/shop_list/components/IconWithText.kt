package com.myprojects.msa_project.presentation.shop_list.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myprojects.msa_project.ui.theme.Typography

@Composable
fun IconWithText(
    @DrawableRes icon: Int,
    text: String,
    modifier: Modifier = Modifier
) {
    val textColor = when (text) {
        "Open" -> {
            Color.Green
        }
        "Closed" -> {
            Color.Red
        }
        else -> {
            Color(0xff595959)
        }
    }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(18.dp),
            tint = Color(0xff595959),
        )
        Text(
            text = text,
            style = Typography.bodySmall.copy(
                color = textColor,
            ),
        )
    }
}