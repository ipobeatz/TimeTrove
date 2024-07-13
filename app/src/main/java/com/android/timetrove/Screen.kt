package com.android.timetrove

import com.android.timeTrove.R


sealed class Screen(val route: String, val icon: Int) {
    object TimeTrove : Screen("home", R.drawable.calendar)
    object Fragment2 : Screen("date", R.drawable.calendar)
    object Fragment3 : Screen("profile", R.drawable.calendar)


}