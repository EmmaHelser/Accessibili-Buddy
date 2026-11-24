package com.experimental.accessibili_buddy.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "What do you need help with today?",
            style = MaterialTheme.typography.headlineLarge,
        )
        Spacer(modifier = Modifier.height(24.dp))
        CategoryButtons()
    }
}

@Composable
fun CategoryButtons(
    modifier: Modifier = Modifier,
) {
    FlowRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        for (category in CategoryEnum.entries) {
            if (category.ranking == 1) {
                AssistChip(
                    onClick = {},
                    label = {
                        Text(
                            text = category.displayName,
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                )
            }
        }
    }
}