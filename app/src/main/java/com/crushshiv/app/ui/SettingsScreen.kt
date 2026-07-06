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
fun SettingsScreen() {

    var music by remember { mutableStateOf(true) }
    var sound by remember { mutableStateOf(true) }
    var vibration by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF2196F3),
                        Color(0xFF9C27B0)
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
                text = "⚙️ Settings",
                fontSize = 32.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            SettingItem(
                title = "🎵 Music",
                checked = music,
                onChange = { music = it }
            )

            SettingItem(
                title = "🔊 Sound",
                checked = sound,
                onChange = { sound = it }
            )

            SettingItem(
                title = "📳 Vibration",
                checked = vibration,
                onChange = { vibration = it }
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("Save Settings")
            }
        }
    }
}

@Composable
fun SettingItem(
    title: String,
    checked: Boolean,
    onChange: (Boolean) -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = title,
            color = Color.White,
            fontSize = 20.sp
        )

        Switch(
            checked = checked,
            onCheckedChange = onChange
        )
    }
}
