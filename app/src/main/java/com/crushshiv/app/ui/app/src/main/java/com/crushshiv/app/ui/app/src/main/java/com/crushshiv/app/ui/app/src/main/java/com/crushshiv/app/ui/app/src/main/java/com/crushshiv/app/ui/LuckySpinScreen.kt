package com.crushshiv.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LuckySpinScreen() {

    var reward by remember {
        mutableStateOf("Spin the wheel 🎡")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF9C27B0),
                        Color(0xFFFFC107)
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
                text = "🎡 Lucky Spin",
                fontSize = 34.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp))

            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(
                        Color.White,
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "SPIN",
                    fontSize = 30.sp,
                    color = Color.Magenta
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = reward,
                fontSize = 22.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    reward = listOf(
                        "🪙 500 Coins",
                        "💎 20 Diamonds",
                        "❤️ Extra Life",
                        "🚀 Booster"
                    ).random()
                }
            ) {
                Text("SPIN NOW")
            }
        }
    }
}
