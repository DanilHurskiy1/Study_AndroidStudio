package com.example.compouse.lesson_002

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.compouse.composables.BasicTextView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonExamplesScreen(innerPaddingValues: PaddingValues) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        floatingActionButton = {FloatingActionButton(onClick = {}) {
            Icon(Icons.Default.Search, contentDescription = "Search")
        } }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
            Button(
                modifier = Modifier.padding(16.dp),
                onClick = {},
                enabled = true,
                shape = RoundedCornerShape(bottomEnd = 50.dp, topStart = 50.dp, bottomStart = 16.dp, topEnd = 16.dp),
                border = BorderStroke(2.dp, Color.Yellow),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 100.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Blue,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.White
                ),
                contentPadding = PaddingValues(16.dp),
            ) {
                BasicTextView("Button 1")
            }
            OutlinedButton(onClick = {}) {
                BasicTextView("Button 2")
            }
            TextButton(onClick = {}) {
                BasicTextView("Button 3")
            }
            ElevatedButton(onClick = {}) {
                BasicTextView("Button 4")
            }
            FilledTonalButton(onClick = {}) {
                BasicTextView("Button 5")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Default.Search, contentDescription = "Search")
            }

            SingleChoiceSegmentedButtonRow {
                SegmentedButton(
                    selected = true,
                    onClick = {},
                    shape = SegmentedButtonDefaults.baseShape
                ) { }
                SegmentedButton(
                    selected = false,
                    onClick = {},
                    shape = SegmentedButtonDefaults.baseShape
                ) { }
                SegmentedButton(
                    selected = false,
                    onClick = {},
                    shape = SegmentedButtonDefaults.baseShape
                ) { }
            }
        }
    }

}
