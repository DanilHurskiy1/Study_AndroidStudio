package com.example.compouse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .background(Color.White)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello World!", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(50.dp),
            color = Color.Blue,
            fontSize = 32.sp,
            fontWeight = FontWeight.W900,
            fontStyle = FontStyle.Italic,
            letterSpacing = 10.sp,
            textAlign = TextAlign.Center,
            lineHeight = 50.sp
        )
        Row(modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BasicTextView(text = "Hello $name!")
            BasicTextView(text = "Hello $name!")
            BasicTextView(text = "Hello $name!")
        }
        BasicTextView(text = "Hello $name!")
    }
}