package com.example.compouse

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BasicTextView(text : String){
    Text(text = "Hello $text!")
}

@Composable
fun BasicTextView(text : String, modifier: Modifier = Modifier){}