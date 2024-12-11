package com.example.compouse.lesson_003

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListExamples(innerPadding: PaddingValues) {
    LazyColumn(modifier = Modifier.fillMaxWidth().padding(innerPadding)) {
        item {
            Text(text = "Item 1")
        }
//        item(30){ index ->
//            Text(text = "android $index")
//        }
        item {
            Text(text = "Last Item")
        }
    }
}