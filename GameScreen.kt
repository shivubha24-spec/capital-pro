package com.crushshiv.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.crushshiv.app.game.CandyType
import kotlin.random.Random

@Composable
fun GameScreen() {

    var score by remember { mutableStateOf(0) }

    val candies = remember {
        MutableList(81) {
            CandyType.values()[Random.nextInt(6)]
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "🍬 Crush Shiv",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Score : $score",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(9)
        ) {

            items(candies.size) { index ->

                val color = when (candies[index]) {
                    CandyType.RED -> Color.Red
                    CandyType.BLUE -> Color.Blue
                    CandyType.GREEN -> Color.Green
                    CandyType.YELLOW -> Color.Yellow
                    CandyType.PURPLE -> Color(0xFF9C27B0)
                    CandyType.ORANGE -> Color(0xFFFF9800)
                    else -> Color.White
                }

                Surface(
                    modifier = Modifier
                        .padding(2.dp)
                        .size(36.dp)
                        .border(1.dp, Color.White)
                        .background(color)
                        .clickable {
                            score += 10
                        },
                    color = color
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        Text("🍬")
                    }
                }
            }
        }
    }
}
