package com.example.composemvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Red)),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Item 1 ",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }

                Spacer(modifier = Modifier.padding(20.dp))

                Row(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Red))
                ) {
                    Text(
                        text = "Item 1 ",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }

        }

        /*setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFE5E4E2))
                    .verticalScroll(rememberScrollState())


            ) {
                Image(
                    painter = painterResource(id = R.drawable.burger),
                    contentDescription = null,
                    modifier = Modifier.clip(RoundedCornerShape(10))
                        .height(300.dp),
                    contentScale = ContentScale.Crop,
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Happy Meal",
                        fontSize = 26.sp
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 Calories",
                        fontSize = 16.sp
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "$5",
                        style = TextStyle(
                            color = Color(0xFF85bb65),
                            fontSize = 16.sp
                        ),
                    )
                }
            }

        }*/
    }
}

