package com.crushshiv.app

import import com.crushshiv.app.navigation.CrushShivNavigation
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

    CrushShivNavigation()
            ()
        }
    }
}

@Composable
fun CrushShivApp() {
    MaterialTheme {
        HomeScreen()
    }
}

@Composable
fun HomeScreen() {

    val gradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF7B1FA2),
            Color(0xFFE91E63),
            Color(0xFFFF9800)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradient)
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "🍬 CRUSH SHIV 🍬",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp)
            ) {
                Text("PLAY", fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp)
            ) {
                Text("LEVELS")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp)
            ) {
                Text("SHOP")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp)
            ) {
                Text("PREMIUM")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp)
            ) {
                Text("SETTINGS")
            }
        }
    }
}
