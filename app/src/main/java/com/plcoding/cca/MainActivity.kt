package com.plcoding.cca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.plcoding.cca.presentation.ui.theme.CAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    
                }
            }
        }
    }
}