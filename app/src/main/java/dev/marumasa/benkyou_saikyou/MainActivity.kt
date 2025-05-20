package dev.marumasa.benkyou_saikyou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.marumasa.benkyou_saikyou.ui.theme.Nise_ytTheme
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Nise_ytTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    @Composable
    fun Greeting(modifier: Modifier = Modifier) {
        val rainbowColors = listOf(
            Color.Red,
            Color.Yellow,
            Color.Green,
            Color.Blue,
            Color.Magenta
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black), // 背景色を黒に設定 (任意)
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = """
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                    勉強最強！勉強最強！勉強最強！勉強最強！勉強最強！
                """.trimIndent(),
                style = TextStyle(
                    fontSize = 48.sp, // 文字サイズを大きく設定
                    brush = Brush.linearGradient(
                        colors = rainbowColors
                    ),
                    textAlign = TextAlign.Center // テキストを中央揃え
                ),
                modifier = modifier
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Nise_ytTheme {
            Greeting()
        }
    }
}