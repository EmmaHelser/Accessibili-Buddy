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
import com.experimental.accessibili_buddy.search.SearchScreen
import com.experimental.accessibili_buddy.ui.theme.AccessibiliBuddyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            AccessibiliBuddyTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        NavBar(
                            navController = navController,
                        )
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
                        composable<SearchRoute> {
                            SearchScreen(
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        composable<BrowseRoute> { /* BrowseScreen */ }
                        composable<SavedRoute> { /* SavedScreen */ }
                        composable<TutorialRoute> { /* TutorialScreen */ }
                    }
                }
            }
        }
    }
}