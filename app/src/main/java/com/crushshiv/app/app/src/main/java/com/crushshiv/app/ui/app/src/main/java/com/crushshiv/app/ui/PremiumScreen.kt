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
fun PremiumScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFFD700),
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
                text = "👑 Crush Shiv Premium",
                fontSize = 30.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = "Premium Benefits",
                fontSize = 22.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = """
                ✨ No Ads
                ❤️ Unlimited Lives
                💎 Extra Diamonds
                🎁 Exclusive Rewards
                🚀 Premium Levels
                """.trimIndent(),
                fontSize = 18.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("SUBSCRIBE PREMIUM")
            }
        }
    }
}
