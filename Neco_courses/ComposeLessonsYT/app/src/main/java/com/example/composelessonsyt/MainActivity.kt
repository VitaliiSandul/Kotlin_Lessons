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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelessonsyt.ui.theme.Gray100

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ){
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image_1, "Tesla"),
                        ItemRowModel(R.drawable.image_2, "Zelenski"),
                        ItemRowModel(R.drawable.image_3, "Einstein"),
                        ItemRowModel(R.drawable.image_4, "Mandela"),
                        ItemRowModel(R.drawable.image_5, "Monroe"),
                        ItemRowModel(R.drawable.image_1, "Tesla"),
                        ItemRowModel(R.drawable.image_2, "Zelenski"),
                        ItemRowModel(R.drawable.image_3, "Einstein"),
                        ItemRowModel(R.drawable.image_4, "Mandela"),
                        ItemRowModel(R.drawable.image_5, "Monroe")
                    )
                ) { _, item ->
                    ItemRow(item = item)
                }


            }
        }
    }
}
