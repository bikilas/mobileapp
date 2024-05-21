package com.example.tutorial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme // Using Material3 theme
import androidx.compose.material3.Surface // Using Material3 Surface
import androidx.compose.material3.Text // Using Material3 Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorial1.ui.theme.Tutorial1Theme // Assuming you have a custom theme defined in ui.theme package

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial1Theme { // Applying your custom theme
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background // Using Material3 theme colors
                ) {
                    Greeting("Android") // Passing "Android" to the Greeting composable
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tutorial1Theme {
        Greeting("Android") // Previewing the Greeting composable with "Android" text
    }
}
