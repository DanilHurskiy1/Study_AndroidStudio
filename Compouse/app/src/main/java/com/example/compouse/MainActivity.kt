package com.example.compouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.compouse.lesson_001.Greeting
import com.example.compouse.lesson_002.ButtonExamplesScreen
import com.example.compouse.lesson_003.ListExamples
import com.example.compouse.ui.theme.CompouseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompouseTheme {
                Scaffold(
                    content = { innerPadding ->
                        ListExamples(innerPadding = innerPadding)
//                        ButtonExamplesScreen(innerPaddingValues = innerPadding)
//                        Greeting(
//                            name = "Android",
//                            modifier = Modifier.padding(innerPadding)
//                        )
//                        MyScreen(modifier = Modifier.padding(innerPadding))
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true , showSystemUi = true, device = Devices.PIXEL)
@Composable
fun GreetingPreview() {
    CompouseTheme {
        Greeting("Android")
    }
}