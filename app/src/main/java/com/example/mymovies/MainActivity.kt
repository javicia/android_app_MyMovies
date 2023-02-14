 package com.example.mymovies

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.example.mymovies.ui.theme.MainScreen
import com.example.mymovies.ui.theme.screen.detail.DetailScreen


 @OptIn(ExperimentalCoilApi::class, ExperimentalFoundationApi::class)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController , startDestination = "main" ){
               composable("main"){
                   MainScreen()
               }
                composable("detail"){
                    DetailScreen()
                }
            }

        }
    }
    }
