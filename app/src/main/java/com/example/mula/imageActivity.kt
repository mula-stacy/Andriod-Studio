package com.example.mula

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mula.ui.theme.MulaTheme

class imageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myimage()
            
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myimage() {
    val mContext = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        TopAppBar(title = { Text(text = "form", fontWeight = FontWeight.Bold, fontSize = 25.sp) },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="ArrowBack" )
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
        Text(
            text = "BREEDS OF DOGS",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 50.dp),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(5.dp))

        //First row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "bulldog",
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
            )

            Column {
                Text(
                    text = "BULLDOG",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domesticated descendant of the wolf. Also called the domestic dog")

            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        //Second row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "bulldog",
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
            )

            Column {
                Text(
                    text = "GERMAN SHEPHERD",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domesticated descendant of the wolf. Also called the domestic dog")

            }
        }
        Spacer(modifier = Modifier.height(5.dp))

        //First row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = "bulldog",
                modifier = Modifier
                    .size(width = 200.dp, height = 150.dp)
            )

            Column {
                Text(
                    text = "SIBERIAN HUSKY",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domesticated descendant of the wolf. Also called the domestic dog")

            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        //Circular image
        Image(
            painter = painterResource(id = R.drawable.img_2),
            contentDescription = "image",
            modifier = Modifier
                .size(128.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(5.dp))
        Button(
            onClick = { mContext.startActivity(Intent(mContext, ScrollActivity::class.java)) },
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp)
        ) {
            Text(text = "Next")

        }
    }
}



@Preview(showBackground = true)
@Composable
fun myimagePreview(){
    myimage()
    
}



