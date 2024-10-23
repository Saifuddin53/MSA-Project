package com.myprojects.msa_project.presentation.home.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.myprojects.msa_project.ui.theme.Typography
import kotlinx.coroutines.delay

@Composable
fun TypingText(
    text: String,
    modifier: Modifier = Modifier,
    typingSpeed: Long = 50L // Control the typing speed (in milliseconds)
) {
    var visibleText by remember { mutableStateOf("") }

    LaunchedEffect(text) {
        visibleText = ""
        text.forEachIndexed { index, _ ->
            delay(typingSpeed)
            visibleText = text.take(index + 1)
        }
    }

    Text(
        text = visibleText,
        modifier = modifier,
        style = Typography.titleMedium,
        color = Color.Black
    )
}