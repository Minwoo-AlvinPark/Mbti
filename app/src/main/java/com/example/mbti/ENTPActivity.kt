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

class ENTPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용
                ENTPScreen() // ENTP 정보 표시
            }
        }
    }
}

@Composable
fun ENTPScreen() {
    // ENTP 유형 정보
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ENTP 유형 (발명가)")
        Text(text = "ENTP 유형은 '발명가' 또는 '똑똑한 발명가'를 의미합니다.")
        Text(text = "창의적이고 독창적인 성격으로, 문제 해결에 대해 흥미를 가집니다.")
        Text(text = "호기심이 많고 새로운 아이디어를 탐구하는 것을 좋아합니다.")
        Text(text = "논리적이고 분석적인 사고를 가지고 있으며, 문제에 대한 다양한 해결책을 제시합니다.")
        // ENTP 특성, 강점, 약점, 사례 등에 대한 추가 정보 추가 가능
    }
}

@Composable
@Preview(showBackground = true)
fun ENTPScreenPreview() {
    ENTPScreen() // ENTP 화면 미리보기
}
