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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShopScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF9C27B0),
                        Color(0xFFFF9800)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "🛒 Crush Shiv Shop",
                fontSize = 30.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("🪙 Buy 1000 Coins")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("💎 Buy 100 Diamonds")
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("🚀 Buy Booster Pack")
            }
        }
    }
}
