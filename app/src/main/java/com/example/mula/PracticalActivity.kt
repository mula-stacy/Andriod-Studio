package com.example.mula

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mula.ui.theme.MulaTheme

class PracticalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            work()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun work() {

    val mContext = LocalContext.current
    var search by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        //topbar
        TopAppBar(title = { Text(text = "JUMIA", fontWeight = FontWeight.Bold, fontSize = 25.sp) },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            MainActivity::class.java
                        )
                    )
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "ArrowBack")
                }

            },
            actions = {

                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "check out this company")
                    mContext.startActivity(Intent.createChooser(shareIntent, "share"))

                }) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                }
                IconButton(onClick = {
                    val settingsIntent = Intent(Settings.ACTION_SETTINGS)
                    mContext.startActivity(settingsIntent)
                }) {
                    Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings")
                }
            })
        Spacer(modifier = Modifier.width(10.dp))
        OutlinedTextField(value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
            placeholder = {
                Text(text = "search...")
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Do you want to shop?",
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 10.dp)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {


//ROW1


            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .horizontalScroll(rememberScrollState())
            ) {
                //CARD1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //CARD2

                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_19),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Twopiece set", fontSize = 15.sp)
                        Text(text = "origin : burundi", fontSize = 15.sp)
                        Text(text = "price : 18,000", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //CARD3
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_20),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : watch", fontSize = 15.sp)
                        Text(text = "origin : Turkey", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                // CARD4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_21),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : mammie jeans", fontSize = 15.sp)
                        Text(text = "origin : Uganda", fontSize = 15.sp)
                        Text(text = "price : 500", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }


            }
            //ROW2
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .horizontalScroll(rememberScrollState())
            ) {
                //CARD1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_22),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : crop top", fontSize = 15.sp)
                        Text(text = "origin : Tanzania", fontSize = 15.sp)
                        Text(text = "price : 300", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                // CARD2
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_23),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : jamsuit", fontSize = 15.sp)
                        Text(text = "origin : congo", fontSize = 15.sp)
                        Text(text = "price : 1600", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                // CARD3
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                // CARD4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }

            }
            Spacer(modifier = Modifier.width(15.dp))
            //ROW3
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .horizontalScroll(rememberScrollState())
            ) {
                //CARD1
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //CARD2
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //CARD3
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //CARD4
                Card {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = "",
                            modifier = Modifier.size(180.dp)
                        )

                        Text(text = "Name : Etsty", fontSize = 15.sp)
                        Text(text = "origin : California", fontSize = 15.sp)
                        Text(text = "price : 15,00", fontSize = 15.sp)
                        Button(
                            onClick = {
                                val simToolKitLauncherIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                            },
                            colors = ButtonDefaults.buttonColors(Color.Green),
                            shape = RectangleShape
                        ) {
                            Text(text = "Buy")

                        }

                    }

                }

            }


        }
    }


}



@Preview(showBackground = true)
@Composable
fun workPreview(){
    work()
}
