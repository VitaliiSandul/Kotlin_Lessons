package com.example.composelessonsyt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                listItem("Will Smith - 1", "actor")
                listItem("Will Smith - 2", "actor")
                listItem("Will Smith - 3", "actor")
                listItem("Will Smith - 4", "actor")
                listItem("Will Smith - 1", "actor")
                listItem("Will Smith - 2", "actor")
                listItem("Will Smith - 3", "actor")
                listItem("Will Smith - 4", "actor")
                listItem("Will Smith - 1", "actor")
                listItem("Will Smith - 2", "actor")
                listItem("Will Smith - 3", "actor")
                listItem("Will Smith - 4", "actor")
                listItem("Will Smith - 1", "actor")
                listItem("Will Smith - 2", "actor")
                listItem("Will Smith - 3", "actor")
                listItem("Will Smith - 4", "actor")
            }

        }
    }
}

@Composable
private fun listItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
//            .clickable {
//                Log.d("MyLog", "Clicked")
//            },
            .pointerInput(Unit) {
//                detectDragGesturesAfterLongPress { change, dragAmount ->
//                    Log.d("MyLog", "Long press dragAmount: ${dragAmount}")
//                    Log.d("MyLog", "Long press change.position: ${change.position}")
//                }

//                detectTapGestures {
//                    Log.d("MyLog", "TapGestures: ${it}")
//                }

                detectHorizontalDragGestures { change, dragAmount ->
                    Log.d("MyLog", "HorizontalDragGestures dragAmount: ${dragAmount}")
                }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)

    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.will_smith),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }

            }
        }
    }
}

