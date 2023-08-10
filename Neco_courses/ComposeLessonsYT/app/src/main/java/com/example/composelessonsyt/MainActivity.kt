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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .verticalScroll(rememberScrollState())
//            ){
//                for (i in 0..100){
//                    Text(
//                        text = "Item # $i",
//                        fontSize = 30.sp,
//                        modifier = Modifier.padding(vertical = 10.dp)
//                    )
//                }
//            }

            //works like recyclerview good for memory
//            LazyColumn(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .fillMaxSize()
//            ){
//                items(count = 100) {
//                    Text(
//                        text = "Item # $it",
//                        fontSize = 30.sp,
//                        modifier = Modifier.padding(vertical = 10.dp)
//                    )
//                }
//
//
//            }

//            LazyColumn(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .fillMaxSize()
//            ){
//                itemsIndexed(
//                    listOf("item 1", "item 2", "End", "item 4", "Finish", "item 6", "item 7")
//                ) { index, item ->
//                    Text(
//                        text = "Index -> $index; Item value -> $item",
//                        fontSize = 30.sp,
//                        modifier = Modifier.padding(vertical = 10.dp)
//                    )
//                }
//
//
//            }

            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
            ){
                itemsIndexed(
                    listOf("item 1", "item 2", "End", "item 4", "Finish", "item 6", "item 7")
                ) { index, item ->
                    Text(
                        text = "Index -> $index; Item value -> $item",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                }


            }
        }
    }
}
