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

class ISTJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // Apply theme if needed
                ISTJScreen() // Display ISTJ information
            }
        }
    }
}

@Composable
fun ISTJScreen() {
    // ISTJ type information
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ISTJ 유형 (실용주의자)")
        Text(text = "ISTJ 유형은 '실용주의자' 또는 '논리학자'를 의미합니다.")
        Text(text = "실용적이고 논리적인 성격을 가지고 있으며, 규칙과 질서를 중요시 여깁니다.")
        Text(text = "책임감이 강하고 의무감이 강하며, 맡은 일을 완벽하게 수행하려고 노력합니다.")
        Text(text = "과거의 경험과 사실을 중요시 여기며, 변화보다는 안정을 선호합니다.")

        // Add more details about ISTJ characteristics, strengths, weaknesses, and examples

    }
}

@Composable
@Preview(showBackground = true)
fun ISTJScreenPreview() {
    ISTJScreen() // Preview ISTJ screen
}
