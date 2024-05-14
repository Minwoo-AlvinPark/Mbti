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

class ENTJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                ENTJScreen()
            }
        }
    }
}

@Composable
fun ENTJScreen() {
    // ENTJ 유형에 대한 정보 표시
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ENTJ 유형 (지도자)")
        Text(text = "ENTJ 유형은 '지도자' 또는 '대표자'를 의미합니다.")
        Text(text = "자신의 비전과 목표를 이루기 위해 다른 사람들을 이끌고 조직을 구성하는 능력이 뛰어나며, 목적을 달성하기 위해 결단력 있고 효율적으로 일하는 경향이 있습니다.")
        // 추가적인 정보나 특징을 표시할 수 있습니다.
    }
}

@Composable
@Preview(showBackground = true)
fun ENTJScreenPreview() {
    ENTJScreen()
}