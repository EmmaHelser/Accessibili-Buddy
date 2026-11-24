package com.experimental.accessibili_buddy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.FolderOpen
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.experimental.accessibili_buddy.data.BrowseRoute
import com.experimental.accessibili_buddy.data.HomeRoute
import com.experimental.accessibili_buddy.data.SavedRoute
import com.experimental.accessibili_buddy.data.SearchRoute
import com.experimental.accessibili_buddy.data.TutorialRoute
import com.experimental.accessibili_buddy.data.navigateToTab
import com.experimental.accessibili_buddy.home.HomeScreen
import com.experimental.accessibili_buddy.ui.theme.AccessibiliBuddyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val backStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = backStackEntry?.destination

            AccessibiliBuddyTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
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
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = HomeRoute,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable<HomeRoute> {
                            HomeScreen(
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        composable<SearchRoute> { /* SearchScreen */ }
                        composable<BrowseRoute> { /* BrowseScreen */ }
                        composable<SavedRoute> { /* SavedScreen */ }
                        composable<TutorialRoute> { /* TutorialScreen */ }
                    }
                }
            }
        }
    }
}