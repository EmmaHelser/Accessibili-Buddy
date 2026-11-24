package com.experimental.accessibili_buddy

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.FolderOpen
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.experimental.accessibili_buddy.data.BrowseRoute
import com.experimental.accessibili_buddy.data.HomeRoute
import com.experimental.accessibili_buddy.data.SavedRoute
import com.experimental.accessibili_buddy.data.SearchRoute
import com.experimental.accessibili_buddy.data.navigateToTab

@Composable
fun NavBar(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination

    NavigationBar() {
        NavigationBarItem(
            selected = currentDestination?.hasRoute<HomeRoute>() == true,
            onClick = {
                navController.navigateToTab(HomeRoute)
            },
            icon = {
                Icon(
                    Icons.Default.Home,
                    "Home",
                )
            },
            label = {},
        )
        NavigationBarItem(
            selected = currentDestination?.hasRoute<SearchRoute>() == true,
            onClick = {
                navController.navigateToTab(SearchRoute)
            },
            icon = {
                Icon(
                    Icons.Default.Search,
                    "Search tutorials",
                )
            },
            label = {},
        )
        NavigationBarItem(
            selected = currentDestination?.hasRoute<BrowseRoute>() == true,
            onClick = {
                navController.navigateToTab(BrowseRoute())
            },
            icon = {
                Icon(
                    Icons.Default.FolderOpen,
                    "Browse all tutorials",
                )
            },
            label = {},
        )
        NavigationBarItem(
            selected = currentDestination?.hasRoute<SavedRoute>() == true,
            onClick = {
                navController.navigateToTab(SavedRoute)
            },
            icon = {
                Icon(
                    Icons.Default.BookmarkBorder,
                    "Saved tutorials",
                )
            },
            label = {},
        )
    }
}