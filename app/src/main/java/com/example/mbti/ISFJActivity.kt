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

class ISFJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용 (선택사항)
                ISFJScreen() // ISFJ 유형 화면 표시
            }
        }
    }
}

@Composable
fun ISFJScreen() {
    // ISFJ 유형에 대한 정보 표시
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ISFJ 유형 (보호자)")
        Text(text = "ISFJ 유형은 '보호자' 또는 '헌신적인 실용주의자'를 의미합니다.")
        Text(text = " 따뜻하고 배려심 있는 성격을 가지고 있으며, 다른 사람들을 돌보고 돕는 것을 좋아합니다.")

        // 추가적인 정보나 특징을 표시할 수 있습니다.
    }
}

@Composable
@Preview(showBackground = true)
fun ISFJScreenPreview() {
    ISFJScreen() // ISFJ 유형 화면 미리보기
}
