package com.android.timetrove

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.timeTrove.R
import com.android.timetrove.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TimeTrove)
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MainContent()
            }
        }
    }
}