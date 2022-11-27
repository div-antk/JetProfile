package com.example.jetprofile

import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Profile()
                }
//                    Text(
//                        text = "あんどた",
//                        color = Color.Gray,
//                        fontSize = 16.sp,
//                        fontWeight = FontWeight.ExtraBold,
//                    )                         }
            }
        }
    }
}

@Composable
fun Profile() {
    Text(
        text = "あんどた",
        color = Color.Gray,
        fontSize = 16.sp,
        fontWeight = FontWeight.ExtraBold,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetProfileTheme {
        Profile()
    }
}