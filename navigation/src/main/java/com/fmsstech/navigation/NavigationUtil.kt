package com.fmsstech.navigation

import androidx.navigation.NavHostController

/**
 * Usage:
 * navController.navigateWithArgs("detail", mapOf("id" to "123", "name" to "John"))
 */
fun NavHostController.navigateWithArgs(route: String, args: Map<String, String>) {
    val routeWithArgs = args.entries.joinToString("&", prefix = "$route?") { "${it.key}=${it.value}" }
    this.navigate(routeWithArgs)
}

fun NavHostController.popBackStackUntil(route: String, inclusive: Boolean = false) {
    this.popBackStack(route, inclusive)
}

fun NavHostController.navigateAndClearBackstack(route: String) {
    this.navigate(route) {
        popUpTo(this@navigateAndClearBackstack.graph.startDestinationId) {
            inclusive = true
        }
        launchSingleTop = true
    }
}