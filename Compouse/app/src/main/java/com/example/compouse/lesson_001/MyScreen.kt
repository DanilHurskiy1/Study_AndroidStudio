package com.example.compouse.lesson_001

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Button(onClick = {}, modifier = Modifier.align(Alignment.TopEnd)) {
            Text(text = "Click me")
        }
        Button(onClick = {}, modifier = Modifier.align(Alignment.TopStart)) {
            Text(text = "Click me")
        }
        Button(onClick = {}, modifier = Modifier.align(Alignment.Center)) {
            Text(text = "Click me")
        }
    }
}