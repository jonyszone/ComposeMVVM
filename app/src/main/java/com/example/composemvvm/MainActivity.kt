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
import androidx.compose.material.Button
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
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFE5E4E2))
                    .verticalScroll(rememberScrollState())


            ) {
                Image(
                    painter = painterResource(id = R.drawable.burger),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10))
                        .height(300.dp),
                    contentScale = ContentScale.Crop,
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {


                        Text(
                            text = "Happy Meal",
                            fontSize = 26.sp
                        )

                        //Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(
                            text = "$5",
                            style = TextStyle(
                                color = Color(0xFF85bb65),
                                fontSize = 16.sp
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }

                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "800 Calories",
                        fontSize = 16.sp
                    )

                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(
                        onClick = { /*TODO*/ },
                    modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Text(text = "Order Now")
                    }
                }
            }

        }
    }
}

