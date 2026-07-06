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

data class PlayerRank(
    val rank: Int,
    val name: String,
    val score: Int
)

@Composable
fun LeaderboardScreen() {

    val players = listOf(
        PlayerRank(1, "Shiv Player", 12500),
        PlayerRank(2, "Candy King", 9800),
        PlayerRank(3, "Puzzle Master", 7500),
        PlayerRank(4, "Star Player", 6200)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF2196F3),
                        Color(0xFF673AB7)
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
                text = "🏆 Leaderboard",
                fontSize = 32.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(20.dp))

            players.forEach { player ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {

                    Row(
                        modifier = Modifier.padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "#${player.rank} ${player.name}",
                            fontSize = 18.sp
                        )

                        Text(
                            text = "${player.score} ⭐",
                            fontSize = 18.sp
                        )
                    }
                }
            }
        }
    }
}
