package com.crushshiv.app.admin

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
fun AdminPanel() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF212121),
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
                text = "⚙️ Crush Shiv Admin Panel",
                fontSize = 30.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(25.dp))

            AdminButton("👥 Manage Users")

            AdminButton("🎮 Manage Levels")

            AdminButton("🎁 Manage Rewards")

            AdminButton("👑 Premium Users")

            AdminButton("📢 Send Notification")

            AdminButton("📊 Analytics")
        }
    }
}

@Composable
fun AdminButton(title: String) {

    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(
            text = title,
            fontSize = 18.sp
        )
    }
}
