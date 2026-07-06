package com.crushshiv.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DailyRewardScreen() {

    var claimed by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF4CAF50),
                        Color(0xFF2196F3)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "🎁 Daily Reward",
                fontSize = 32.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(25.dp))

            Card(
                shape = RoundedCornerShape(20.dp)
            ) {

                Column(
                    modifier = Modifier.padding(25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Today's Gift",
                        fontSize = 22.sp
                    )

                    Text(
                        text = "🪙 500 Coins\n💎 10 Diamonds\n❤️ 1 Extra Life",
                        fontSize = 18.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(25.dp))

            Button(
                onClick = {
                    claimed = true
                },
                shape = RoundedCornerShape(20.dp),
                enabled = !claimed
            ) {

                Text(
                    if (claimed)
                        "Reward Claimed ✅"
                    else
                        "Claim Reward"
                )
            }
        }
    }
}
