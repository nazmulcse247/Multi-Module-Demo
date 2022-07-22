package com.nazmul.multimoduledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nazmul.multimoduledemo.navigation.NavigationItem
import com.nazmul.multimoduledemo.screen.home.HomeScreen
import com.nazmul.multimoduledemo.ui.theme.MultiModuleDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    MyApp {

                        NavHost(
                            navController = navController,
                            startDestination = NavigationItem.Home.route
                        )
                        {

                            composable(NavigationItem.Home.route) {
                                HomeScreen(navController = navController)
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun MyApp(content: @Composable () -> Unit) {
        content()
    }
}