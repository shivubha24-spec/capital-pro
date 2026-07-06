package com.crushshiv.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onPlayClick: () -> Unit = {}
) {

    val background = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF7B2FF7),
            Color(0xFFF107A3),
            Color(0xFFFFC107)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "🍬 CRUSH SHIV 🍬",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = onPlayClick,
                modifier = Modifier
                    .width(220.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("PLAY")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(onClick = {}) {
                Text("LEVELS")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {}) {
                Text("SHOP")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {}) {
                Text("PREMIUM")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {}) {
                Text("SETTINGS")
            }
        }
    }
}
