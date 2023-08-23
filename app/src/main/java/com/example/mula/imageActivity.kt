package com.example.mula

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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

@Composable
fun myimage(){
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Text(text = "BREEDS oF DOGS",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start =  50.dp),
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

       //first row
        
        Row {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "bulldog",
                modifier = Modifier.
                size(width=200.dp,height=150.dp))
            
           Column {
               Text(text = "BullDog", fontSize = 20.sp,)
               Text(text = "The Dog is a Domestican.Most people keep dogs as pets")
           }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //second row

        Row {
            Image(painter = painterResource(id = R.drawable.img_1),
                contentDescription = "chiwawa",
                modifier = Modifier.
                size(width=200.dp,height=150.dp))

            Column {
                Text(text = "chiwawa", fontSize = 20.sp,)
                Text(text = "The Dog is a Domestican.most people keep them as pets")
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //third row

        Row {
            Image(painter = painterResource(id = R.drawable.img_2),
                contentDescription = "siberian husky",
                modifier = Modifier.
                size(width=200.dp,height=150.dp))

            Column {
                Text(text = "siberian husky", fontSize = 20.sp,)
                Text(text = "The Dog is a Domestican.Most people have Dogs as Pets")
            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        //circular image
        Image(painter = painterResource(id = R.drawable.img_2) ,
            contentDescription ="image",
            modifier = Modifier.
            size(128.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop)


    }
    
}

@Preview(showBackground = true)
@Composable
fun myimagePreview(){
    myimage()
    
}
