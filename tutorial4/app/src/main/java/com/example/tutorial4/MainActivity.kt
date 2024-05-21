package com.example.tutorial4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tutorial4.ui.theme.Tutorial4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial4Theme {
                Conversation(SampleData.conversationSample)
            }
        }
    }
}

data class Message(val author: String, val body: String)

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message("Colleague", "Test...Test...Test..."),
        Message("Colleague", "List of Android versions:\n" +
                "Android 1.0 (API level 1)\n" +
                "Android 1.1 (API level 2)\n" +
                "Android 1.5 (API level 3)\n" +
                "Android 1.6 (API level 4)\n" +
                "Android 2.0 (API level 5)\n" +
                "Android 2.0.1 (API level 6)\n" +
                "Android 2.1 (API level 7)\n" +
                "Android 2.2 (API level 8)\n" +
                "Android 2.3 (API level 9)\n" +
                "Android 2.3.3 (API level 10)\n" +
                "Android 3.0 (API level 11)\n" +
                "Android 3.1 (API level 12)\n" +
                "Android 3.2 (API level 13)\n" +
                "Android 4.0 (API level 14)\n" +
                "Android 4.0.3 (API level 15)\n" +
                "Android 4.1 (API level 16)\n" +
                "Android 4.2 (API level 17)\n" +
                "Android 4.3 (API level 18)\n" +
                "Android 4.4 (API level 19)\n" +
                "Android 5.0 (API level 21)\n" +
                "Android 5.1 (API level 22)\n" +
                "Android 6.0 (API level 23)\n" +
                "Android 7.0 (API level 24)\n" +
                "Android 7.1 (API level 25)\n" +
                "Android 8.0 (API level 26)\n" +
                "Android 8.1 (API level 27)\n" +
                "Android 9 (API level 28)\n" +
                "Android 10 (API level 29)\n" +
                "Android 11 (API level 30)\n" +
                "Android 12 (API level 31)\n" +
                "Android 13 (API level 33)"),
        Message("Colleague", "Have you tried writing a very long message, I mean, a really really long message, longer than the width of the screen?"),
        Message("Colleague", "can you hear me now?"),
    )
}

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    Tutorial4Theme {
        Conversation(SampleData.conversationSample)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))

        // Keep track if the message is expanded or not
        var isExpanded by remember { mutableStateOf(false) }

        // SurfaceColor will be updated gradually from one color to the other
        val surfaceColor by animateColorAsState(
            if (isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface,
        )

        // Toggle the isExpanded variable when we click on this Column
        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = msg.author,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(modifier = Modifier.height(4.dp))

            Surface(
                shape = MaterialTheme.shapes.medium,
                shadowElevation = 1.dp,
                color = surfaceColor,
                modifier = Modifier
                    .animateContentSize()
                    .padding(1.dp)
            ) {
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 4.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}