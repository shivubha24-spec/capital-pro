package com.crushshiv.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.crushshiv.app.navigation.CrushShivNavigation
import com.crushshiv.app.ui.theme.CrushShivTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            CrushShivTheme {

                CrushShivNavigation()

            }
        }
    }
}
