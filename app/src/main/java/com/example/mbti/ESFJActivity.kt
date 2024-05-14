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

class ESFJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용
                ESFJScreen() // ESFJ 정보 표시
            }
        }
    }
}

@Composable
fun ESFJScreen() {
    // ESFJ 유형 정보
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ESFJ 유형 (외교관)")
        Text(text = "ESFJ 유형은 '외교관' 또는 '사교형'을 의미합니다.")
        Text(text = "사교적이고 친근한 성격을 가지고 있으며, 타인의 감정에 민감합니다.")
        Text(text = "협동적이고 신뢰할 수 있는 사람으로, 타인을 돕고자 하는 성향을 가집니다.")
        Text(text = "일 처리를 체계적으로 하고 일정을 준수하는 것을 중요시합니다.")
        // ESFJ 특성, 강점, 약점, 사례 등에 대한 추가 정보 추가 가능
    }
}

@Composable
@Preview(showBackground = true)
fun ESFJScreenPreview() {
    ESFJScreen() // ESFJ 화면 미리보기
}
