package com.experimental.accessibili_buddy.data

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import kotlinx.serialization.Serializable

@Serializable
object HomeRoute

@Serializable
object SearchRoute

@Serializable
object SavedRoute

@Serializable
data class BrowseRoute(val category: CategoryEnum? = null)

@Serializable
data class TutorialRoute(val id: Int)


fun NavHostController.navigateToTab(route: Any) {
    navigate(route) {
        popUpTo(graph.findStartDestination().id) { saveState = true }
        launchSingleTop = true
        restoreState = true
    }
}