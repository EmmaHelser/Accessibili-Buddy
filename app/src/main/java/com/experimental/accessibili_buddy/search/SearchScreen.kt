package com.experimental.accessibili_buddy.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
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

    Column(
        modifier = modifier,
    ) {
        SearchBar(
            state = searchBarState,
            inputField = inputField,
        )
        LazyColumn() {

        }
    }
}

@Composable
fun SearchItem(
    item: Tutorial,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
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