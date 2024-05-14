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

class ENFPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // Apply theme if needed
                ENFPScreen() // Display ENFP information
            }
        }
    }
}

@Composable
fun ENFPScreen() {
    // ENFP type information
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ENFP 유형 (활동가)")
        Text(text = "ENFP 유형은 '활동가' 또는 '모험가'를 의미합니다.")
        Text(text = "열정적이고 창의적인 성격으로, 새로운 아이디어에 높은 관심을 가집니다.")
        Text(text = "자유로운 영혼이며, 새로운 경험을 추구하고 변화를 즐깁니다.")
        Text(text = "타인을 잘 돕고 동기를 부여하는 능력이 있으며, 사람들과의 관계를 중요하게 생각합니다.")
        // Add more details about ENFP characteristics, strengths, weaknesses, and examples
    }
}

@Composable
@Preview(showBackground = true)
fun ENFPScreenPreview() {
    ENFPScreen() // Preview ENFP screen
}
