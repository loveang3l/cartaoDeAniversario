package com.example.cartaodeaniversario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cartaodeaniversario.ui.theme.CartaoDeAniversarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeAniversarioTheme {

                }
            }
        }
    }





@Preview(showSystemUi = true)
@Composable
fun TelaCartaoPresente (){

    Text(
        text = "Feliz aniversário do álbum 'Honeymoon'"
    )

    Text(
        text = "Para: LDR"
    )
}