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

class ESTJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용
                ESTJScreen() // ESTJ 정보 표시
            }
        }
    }
}

@Composable
fun ESTJScreen() {
    // ESTJ 유형 정보
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ESTJ 유형 (관리자)")
        Text(text = "ESTJ 유형은 '관리자' 또는 '현실가'를 의미합니다.")
        Text(text = "신뢰할 수 있고 직접적이며 현실적인 성격을 가지고 있습니다.")
        Text(text = "계획적이고 조직적으로 일을 처리하며, 목표를 달성하기 위해 노력합니다.")
        Text(text = "책임감이 강하고 사회적으로 인정받는 역할을 선호합니다.")
        // ESTJ 특성, 강점, 약점, 사례 등에 대한 추가 정보 추가 가능
    }
}

@Composable
@Preview(showBackground = true)
fun ESTJScreenPreview() {
    ESTJScreen() // ESTJ 화면 미리보기
}
