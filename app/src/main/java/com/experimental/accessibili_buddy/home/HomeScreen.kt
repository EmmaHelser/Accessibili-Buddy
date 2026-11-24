package com.experimental.accessibili_buddy.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AssistChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.experimental.accessibili_buddy.data.CategoryEnum

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth().padding(16.dp),
    ) {
        Text(
            text = "What do you need help with today?",
            style = MaterialTheme.typography.headlineMedium,
        )
        CategoryButtons()
    }
}

@Composable
fun CategoryButtons(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        for (category in CategoryEnum.entries) {
            AssistChip(
                onClick = {},
                label = { Text(category.name) }
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}