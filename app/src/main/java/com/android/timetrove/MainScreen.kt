package com.android.timetrove

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.android.timeTrove.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Preview
@Composable
fun MainContent() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val navController = rememberNavController()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { CustomTopBar(coroutineScope, scaffoldState) },
        drawerContent = {
            Text("Drawer İçeriği", modifier = Modifier.padding(16.dp))
        },
        bottomBar = { BottomNavigationBar(navController) },
        content = { innerPadding ->
            NavigationGraph(navController, Modifier.padding(innerPadding))
        }
    )
}

@Composable
fun CustomTopBar(coroutineScope: CoroutineScope, scaffoldState: ScaffoldState) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFCE73AF))
            .padding(6.dp,6.dp,6.dp,6.dp),contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = {
                coroutineScope.launch { scaffoldState.drawerState.open() }
            }) {
                Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.White)
            }


            Image(
                painter = painterResource(id = R.drawable.calendar),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .width(250.dp)
                    .size(40.dp)
            )


            IconButton(onClick = { /* Sağdaki butonun işlevi */ }) {
                Icon(Icons.Default.MoreVert, contentDescription = "More", tint = Color.White)
            }

            // Örnek bir resim eklemek isterseniz

        }
    }
}
