package com.android.timetrove

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        Screen.TimeTrove,
        Screen.Fragment2,
        Screen.Fragment3
    )
    BottomNavigation(
        backgroundColor = Color(0xFFEEA0A0) // Turuncu renk
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = screen.icon),
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        screen.route.capitalize(),
                        color = if (currentRoute == screen.route) Color.White else Color.Gray
                    )
                },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.DarkGray // Seçili olmayan öğe rengi
            )
        }
    }
}