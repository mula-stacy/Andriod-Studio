package com.example.mula

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.mula.ui.theme.MulaTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myIntent()


        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myIntent() {
    val mContext = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.img_12),
                contentScale = ContentScale.FillBounds
            )

    ) {
        TopAppBar(title = { Text(text = "Intent", fontWeight = FontWeight.Bold, fontSize = 25.sp) },
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

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings")
                }
            }

        )
        Spacer(modifier = Modifier.height(10.dp))
        //STK
        OutlinedButton(onClick = {val simToolKitLauncherIntent=
            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLauncherIntent?.let { mContext.startActivity(it) }
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "PAY VIA MPESA",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        //email
        OutlinedButton(onClick = { val shareIntent=Intent(Intent.ACTION_SEND)
         shareIntent.type="text/plain"
         shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("mulastacy4@gmail.com"))
         shareIntent.putExtra(Intent.EXTRA_SUBJECT,"subject")
         shareIntent.putExtra(Intent.EXTRA_TEXT,"Hello, his is the email")
         mContext.startActivity(shareIntent)                         },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "EMAIL",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        //call
        OutlinedButton(onClick = {
            val callIntent=Intent (Intent.ACTION_DIAL)
            callIntent.data="tel:0716954268".toUri()
            mContext.startActivity(callIntent)

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "CALL",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        //SHARE
        OutlinedButton(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"check out this company")
            mContext.startActivity(Intent.createChooser(shareIntent,"share"))


        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SHARE",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        //SMS
        OutlinedButton(onClick = {
            val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0759834847".toUri()
            smsIntent.putExtra("sms_body","hello am stacy ,how was your day")
            mContext.startActivity(smsIntent)

        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SMS",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        //CAMERA
        OutlinedButton(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if(cameraIntent.resolveActivity(mContext.packageManager)!=null){

            }else{
                println("camera app is not available")
            }
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "CAMERA",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(10.dp))
        //SETTINGS
        OutlinedButton(onClick = {
            val settingsIntent=Intent(Settings.ACTION_SETTINGS)
            mContext.startActivity(settingsIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 20.dp
                ),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "SETTINGS",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)


        }

    }

}
@Preview(showBackground = true)
@Composable
fun myIntentPreview(){
    myIntent()

}


