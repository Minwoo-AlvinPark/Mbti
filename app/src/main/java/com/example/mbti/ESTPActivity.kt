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

class ESTPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // Apply theme if needed
                ESTPScreen() // Display ESTP information
            }
        }
    }
}

@Composable
fun ESTPScreen() {
    // ESTP type information
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ESTP 유형 (기업가)")
        Text(text = "ESTP 유형은 '기업가' 또는 '행동가'를 의미합니다.")
        Text(text = "활동적이고 사교적인 성격이며, 새로운 도전과 모험을 좋아합니다.")
        Text(text = "과감하고 실용적인 사고방식을 가지고 있으며, 빠르게 결정을 내릴 수 있습니다.")
        Text(text = "리더 기질이 뛰어나고, 문제 해결에 능숙합니다.")

        // Add more details about ESTP characteristics, strengths, weaknesses, and examples
    }
}

@Composable
@Preview(showBackground = true)
fun ESTPScreenPreview() {
    ESTPScreen() // Preview ESTP screen
}
