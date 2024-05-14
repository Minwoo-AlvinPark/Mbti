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

class ENFJActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // 테마 적용
                ENFJScreen() // ENFJ 정보 표시
            }
        }
    }
}

@Composable
fun ENFJScreen() {
    // ENFJ 유형 정보
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ENFJ 유형 (선의의 사업가)")
        Text(text = "ENFJ 유형은 '선의의 사업가' 또는 '영혼의 사람'을 의미합니다.")
        Text(text = "친절하고 동정적이며 다른 사람을 이해하려고 노력합니다.")
        Text(text = "사회적 리더십 능력이 있으며, 타인을 도울 수 있는 가능성을 가지고 있습니다.")
        Text(text = "타인과의 관계를 중요시하며, 사회적으로 활동하고 싶어합니다.")
        // ENFJ 특성, 강점, 약점, 사례 등에 대한 추가 정보 추가 가능
    }
}

@Composable
@Preview(showBackground = true)
fun ENFJScreenPreview() {
    ENFJScreen() // ENFJ 화면 미리보기
}
