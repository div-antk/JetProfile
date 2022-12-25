package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme
import com.example.jetprofile.ui.theme.components.CompanySection
import com.example.jetprofile.ui.theme.components.DetailSection

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        // プロフィール画像
        Image(
            painter = painterResource(id = R.drawable.img_profile),
            contentDescription = "プロフィール",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(10.dp)),
        )
        Spacer(modifier = Modifier.height(20.dp))
        // 名前
        Text(
            text = "あんどた",
            color = Color.Gray,
            fontSize = 16.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(20.dp))
        // 職業
        Text(
            text = "職業: Androidエンジニア",
            color = Color.Gray,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))

        // 会社情報
        CompanySection()
        Spacer(modifier = Modifier.height(20.dp))

        // 詳細表示ボタン
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFF85F6A)
            ),
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = "詳細を表示",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        // 趣味&居住地
        DetailSection()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetProfileTheme {
        MainContent()
    }
}