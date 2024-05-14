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

class ESFPActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme { // Apply theme if needed
                ESFPScreen() // Display ESFP information
            }
        }
    }
}

@Composable
fun ESFPScreen() {
    // ESFP type information
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "ESFP 유형 (연예인)")
        Text(text = "ESFP 유형은 '연예인' 또는 '즉흥가'를 의미합니다.")
        Text(text = "사교적이고 열정적인 성격으로, 즉흥적이며 융통성이 있습니다.")
        Text(text = "새로운 경험을 추구하고 즐길 줄 아는 태도를 가지고 있습니다.")
        Text(text = "매력적이고 사람을 잘 다루는 능력이 있으며, 관심을 끄는 것을 좋아합니다.")
        // Add more details about ESFP characteristics, strengths, weaknesses, and examples
    }
}

@Composable
@Preview(showBackground = true)
fun ESFPScreenPreview() {
    ESFPScreen() // Preview ESFP screen
}
