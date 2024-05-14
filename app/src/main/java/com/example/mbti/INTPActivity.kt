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

class INTPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // Apply theme if needed
                INTPScreen() // Display INTP information
            }
        }
    }
}

@Composable
fun INTPScreen() {
    // INTP type information
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "INTP 유형 (전략가)")
        Text(text = "INTP 유형은 '전략가' 또는 '논리학자'를 의미합니다.")
        Text(text = "창의적이고 분석적인 사고력을 가지고 있으며, 문제 해결과 이론構築 (구축)을 좋아합니다.")
        Text(text = "독립적이고 자유로운 사고를 중요시 여기며, 모든 것을 논리적으로 분석하려고 합니다.")
        Text(text = "효율성과 정확성을 중시하며, 새로운 아이디어를 탐구하는 것을 좋아합니다.")

        // Add more details about INTP characteristics, strengths, weaknesses, and examples
    }
}

@Composable
@Preview(showBackground = true)
fun INTPScreenPreview() {
    INTPScreen() // Preview INTP screen
}
