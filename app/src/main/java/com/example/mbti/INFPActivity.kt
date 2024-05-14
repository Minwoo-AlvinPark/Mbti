package com.example.mbti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mbti.ui.theme.MbtiTheme // Optional theme integration

class INFPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // Apply theme if needed
                INFPScreen() // Display INFP information
            }
        }
    }
}

@Composable
fun INFPScreen() {
    // INFP type information
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "INFP 유형 (옹호자)")
        Text(text = "INFP 유형은 '옹호자' 또는 '중재자'를 의미합니다.")
        Text(text = "깊은 사고력과 풍부한 감정을 가진 성격이며, 이상적인 세상을 위해 노력합니다.")
        Text(text = "창의적이고 독창적인 사고방식을 가지고 있으며, 다른 사람들의 감정에 민锐합니다.")
        Text(text = "조용하고 가치관이 강하며, 의미 있는 일을 추구합니다.")

        // Add more details about INFP characteristics, strengths, weaknesses, and examples
    }
}

@Composable
@Preview(showBackground = true)
fun INFPScreenPreview() {
    INFPScreen() // Preview INFP screen
}
