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

class INFJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용
                INFJScreen() // INFJ 유형 화면 표시
            }
        }
    }
}

@Composable
fun INFJScreen() {
    // INFJ 유형에 대한 정보 표시
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "INFJ 유형 (옹호자)")
        Text(text = "INFJ 유형은 '옹호자' 또는 '희귀한 이상주의자'를 의미합니다.")
        Text(text = "깊은 사고력과 풍부한 감정을 가진 성격이며, 세상을 더 나은 곳으로 만들고 싶어 합니다.")

        // 추가적인 정보나 특징을 표시할 수 있습니다.
    }
}

@Composable
@Preview(showBackground = true)
fun INFJScreenPreview() {
    INFJScreen() // INFJ 유형 화면 미리보기
}
