package com.experimental.accessibili_buddy.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.experimental.accessibili_buddy.data.CategoryEnum
import com.experimental.accessibili_buddy.data.LevelEnum
import com.experimental.accessibili_buddy.data.Tutorial

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier.fillMaxSize(),
    viewModel: SearchViewModel = hiltViewModel(),
) {
    val searchBarState = rememberSearchBarState()
    val textFieldState = rememberTextFieldState()

    val inputField = @Composable {
        SearchBarDefaults.InputField(
            textFieldState = textFieldState,
            searchBarState = searchBarState,
            onSearch = { /* run the search */ },
            placeholder = { Text("What do you need help with?") },
        )
    }

    val results = listOf(
        Tutorial(
            1,
            "Turn on flashlight",
            listOf(),
            LevelEnum.BEGINNER,
            setOf(CategoryEnum.GETTING_AROUND_THE_PHONE),
        ),
        Tutorial(
            2,
            "Turn on flashlight",
            listOf(),
            LevelEnum.BEGINNER,
            setOf(CategoryEnum.GETTING_AROUND_THE_PHONE),
        )
    )

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SearchBar(
            state = searchBarState,
            inputField = inputField,
        )
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 2.dp,
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
        ) {
            items(
                items = results,
                key = { it.id }
            ) { result ->
                SearchItem(result)
            }
        }
    }
}

@Composable
fun SearchItem(
    item: Tutorial,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            imageVector = Icons.Default.Image,
            contentDescription = null,
        )
        Column() {
            Text(
                text = item.name,
            )
            Text(
                text = item.level.toString(),
            )
        }
    }
}