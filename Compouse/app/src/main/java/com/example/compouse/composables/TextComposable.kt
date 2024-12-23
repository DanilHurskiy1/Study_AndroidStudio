package com.example.compouse.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BasicTextView(text : String){
    Text(text = text)
}

@Composable
fun BasicTextView(text : String, modifier: Modifier = Modifier){}