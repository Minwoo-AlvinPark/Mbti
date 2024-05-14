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
import com.example.mbti.ui.theme.MbtiTheme

class INTJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                INTJScreen()
            }
        }
    }
}

@Composable
fun INTJScreen() {
    // INTJ 유형에 대한 정보 표시
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "INTJ 유형 (전략가)")
        Text(text = "INTJ 유형은 '전략가' 또는 '아이디어를 가진 조직가'를 의미합니다.")
        Text(text = "창의적이고 전략적인 사고를 가지고 있으며, 목표를 달성하기 위해 계획을 세우고 실행하는 것을 선호합니다.")
        // 추가적인 정보나 특징을 표시할 수 있습니다.
    }
}


@Composable
@Preview(showBackground = true)
fun INTJScreenPreview() {
    INTJScreen()
}