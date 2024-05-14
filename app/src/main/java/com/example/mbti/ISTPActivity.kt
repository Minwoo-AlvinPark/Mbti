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

class ISTPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용 (선택사항)
                ISTPScreen() // ISTP 유형 화면 표시
            }
        }
    }
}

@Composable
fun ISTPScreen() {
    // ISTP 유형에 대한 정보 표시
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ISTP 유형 (실용기술자)")
        Text(text = "ISTP 유형은 '실용기술자' 또는 '논리학자-실용주의자'를 의미합니다.")
        Text(text = "실용적이고 논리적인 성격을 가지고 있으며, 문제 해결과 실용적인 작업을 선호합니다.")

        // 추가적인 정보나 특징을 표시할 수 있습니다.
    }
}

@Composable
@Preview(showBackground = true)
fun ISTPScreenPreview() {
    ISTPScreen() // ISTP 유형 화면 미리보기
}
