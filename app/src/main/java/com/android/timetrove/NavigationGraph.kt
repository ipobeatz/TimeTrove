package com.android.timetrove

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.android.timetrove.home.TimeTrove
import com.android.timetrove.fragment2.Fragment2
import com.android.timetrove.fragment3.Fragment3

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home") { TimeTrove() }
        composable("date") { Fragment3() }
        composable("profile") { Fragment2() }
    }
}