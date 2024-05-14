package com.example.mbti

import ENFJActivity
import ENFPActivity
import ENTPActivity
import ESFJActivity
import ESFPActivity
import ESTJActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        // Display the buttons in a vertical layout
        Column(modifier = Modifier.fillMaxSize()) {
            val context = LocalContext.current

            Mbtides(context, ISFPActivity::class.java, "ENTJ")
            Mbtides(context, INTJActivity::class.java, "INTJ")
            Mbtides(context, ISTJActivity::class.java, "ISTJ")
            Mbtides(context, ISTJActivity::class.java, "ISTJ")
            Mbtides(context, ISFJActivity::class.java, "ISFJ")
            Mbtides(context, INFJActivity::class.java, "INFJ")
            Mbtides(context, ISTPActivity::class.java, "ISTP")
            Mbtides(context, ISFPActivity::class.java, "ISFP")
            Mbtides(context, INFPActivity::class.java, "INFP")
            Mbtides(context, INTPActivity::class.java, "INTP")
            Mbtides(context, ESTPActivity::class.java, "ESTP")
            Mbtides(context, ESFPActivity::class.java, "ESFP")
            Mbtides(context, ENFPActivity::class.java, "ENFP")
            Mbtides(context, ENTPActivity::class.java, "ENTP")
            Mbtides(context, ESTJActivity::class.java, "ESTJ")
            Mbtides(context, ESFJActivity::class.java, "ESFJ")
            Mbtides(context, ENFJActivity::class.java, "ENFJ")
        }
    }

    @Composable
    fun Mbtides(context: Context, activity: Class<*>, txt: String) {
        Button(
            onClick = {
                val intent = Intent(context, activity)
                startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = txt)
        }
    }
}

