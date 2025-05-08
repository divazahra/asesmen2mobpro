package com.divazahra0070.asesmen2mobpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.divazahra0070.asesmen2mobpro.navigation.SetupNavGraph
import com.divazahra0070.asesmen2mobpro.ui.theme.Asesmen2MobproTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Asesmen2MobproTheme {
                SetupNavGraph()
            }
        }
    }
}