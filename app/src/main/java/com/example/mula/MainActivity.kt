package com.example.mula

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.TestModifierUpdaterLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mula.ui.theme.MulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()


        }
    }
}

@Composable
fun demo(){

    val mContext= LocalContext.current
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)
        .padding(20.dp)){
        Text(text = "Hello Mula",
            color = Color.Cyan,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic, textDecoration = TextDecoration.Underline)

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Welcome to Android",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline)
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Kotlin",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif)
        Spacer(modifier = Modifier.height(20.dp))


        Text(text = "Kotlin is Intresting",
            color = Color.Green,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif)

        Divider()
        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Text(text = "text1",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "text2",
                fontSize = 30.sp)

        }
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Text(text = "eMobilis",
                fontSize = 30.sp,
                color = Color.Yellow)
            Spacer(modifier = Modifier.width(50.dp))

            Text(text = "Technology",
                fontSize = 30.sp,
                color = Color.Blue)
            Divider()

        }

        Box {
            Text(text = "Yes",
                fontSize = 30.sp,
                color = Color.Blue)



            Text(text = "No",
                fontSize = 30.sp,
                color = Color.Blue)
            Divider()

        }
        //Button
        //FORM
        Button(onClick = {
                         mContext.startActivity(Intent(mContext,FormActivity::class.java))
        },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)) {
            Text(text = "Form")
    }
        //ADD TO CUT
        Button(onClick = { /*TODO*/ },
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Magenta)
        ) {

            Image(painter = painterResource(id = R.drawable.img_4), contentDescription ="" )
            Text(text = "Add to Cut", modifier = Modifier.padding(start=10.dp))

            
        }
        //JUMIA
        Button(onClick = {mContext.startActivity(Intent(mContext,PracticalActivity::class.java))
        },
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.Blue),
            colors = ButtonDefaults.buttonColors(Color.Cyan))
        {
            Text(text = "JUMIA")

        }
        //INTENTS
        Button(onClick = {mContext.startActivity(Intent(mContext,IntentActivity::class.java))
        },
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.Blue),
            colors = ButtonDefaults.buttonColors(Color.Red))
        {
            Text(text = "Go to intents")

        }
        //Intent
        Button(onClick = {
                         mContext.startActivity(Intent(mContext,imageActivity::class.java))
        },
            colors = ButtonDefaults.outlinedButtonColors(Color.Black),
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp)
        )
        {
            Text(text = "Next", color = Color.White)

        }
        //splash
        Button(onClick = {
            mContext.startActivity(Intent(mContext,LottieAimationActivity::class.java))
        },
            colors = ButtonDefaults.outlinedButtonColors(Color.Black),
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp)
        )
        {
            Text(text = "lottie", color = Color.White)

        }

        
    }
}


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()

}
