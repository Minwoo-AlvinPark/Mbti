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
import com.example.mbti.ui.theme.MbtiTheme // 선택적 테마 적용

class ISFPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 필요하다면 테마 적용
                ISFPScreen() // ISFP 유형 정보 표시
            }
        }
    }
}

@Composable
fun ISFPScreen() {
    // ISFP 유형 정보
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ISFP 유형 (보호자)")
        Text(text = "ISFP 유형은 '보호자' 또는 '헌신적인 실용주의자'를 의미합니다.")
        Text(text = "따뜻하고 배려심이 많으며, 다른 사람들을 돌보고 돕는 것을 좋아합니다.")
        Text(text = "실용적이고 관찰력이 뛰어나며, 현재 순간을 소중히 여깁니다.")
        Text(text = "예술적 재능이 뛰어나고 창의적인 표현을 중요시 여깁니다.")

        // ISFP 성격, 장점, 단점, 유명 인물 등 추가 정보 표시
    }
}

@Composable
@Preview(showBackground = true)
fun ISFPScreenPreview() {
    ISFPScreen() // ISFP 유형 화면 미리보기
}
