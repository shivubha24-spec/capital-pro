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

data class Achievement(
    val title: String,
    val description: String,
    val unlocked: Boolean
)

@Composable
fun AchievementScreen() {

    val achievements = listOf(
        Achievement(
            "🍬 Candy Master",
            "Complete 10 levels",
            true
        ),
        Achievement(
            "⭐ Star Player",
            "Collect 100 stars",
            false
        ),
        Achievement(
            "💎 Diamond Hunter",
            "Collect 500 diamonds",
            false
        ),
        Achievement(
            "👑 Premium King",
            "Become Premium Member",
            false
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFFF9800),
                        Color(0xFFE91E63)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "🏆 Achievements",
                fontSize = 32.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            achievements.forEach { item ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {

                        Text(
                            text = item.title,
                            fontSize = 20.sp
                        )

                        Text(
                            text = item.description
                        )

                        Text(
                            text = if (item.unlocked)
                                "✅ Unlocked"
                            else
                                "🔒 Locked"
                        )
                    }
                }
            }
        }
    }
}
