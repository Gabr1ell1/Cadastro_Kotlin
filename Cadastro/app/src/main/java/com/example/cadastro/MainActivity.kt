package com.example.cadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cadastro.ui.theme.CadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cadastro()
                }
            }
        }
    }
}

@Composable
fun cadastro() {

//posicionando os elementos em coluna
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth(), //A coluna deve ocupar toda a largura disponível do contêiner pai(tela).
        Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally//Alinha os elementos ao centro
    ) {
        Row(
            Modifier

                .fillMaxWidth(), //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
            Arrangement.Center // Alinhando os elementos da linha ao centro horizontalmente
        ) {
            Text(text = "APP DE CADASTRO",
                style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
        }

        //linha e caixa de texto de nome
        Row(
            Modifier
                .padding(8.dp) // Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
            var nome by remember { mutableStateOf("") }
            TextField(
                value = nome,
                onValueChange = { nome = it },
                label = {
                    Text("Nome:")}
                    )
                }

        //linha e caixa de texto de Esdereço
        Row(
            Modifier
                .padding(8.dp) // Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
            var endereco by remember { mutableStateOf("") }
            TextField(
                value = endereco,
                onValueChange = { endereco = it },
                label = { Text("Endereço:") }
            )
        }
        //linha e caixa de texto de bairro
        Row(
            Modifier
                .padding(8.dp)// Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
            var bairro by remember { mutableStateOf("") }
            TextField(
                value = bairro,
                onValueChange = { bairro= it },
                label = { Text("Bairro:") }
            )
        }
        //linha e caixa de texto de cep
        Row(
            Modifier
                .padding(8.dp)// Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
            var cep by remember { mutableStateOf("") }
            TextField(
                value = cep,
                onValueChange = { cep = it },
                label = { Text("CEP:") }
            )
        }
        //linha e caixa de texto de cidade
        Row(
            Modifier
                .padding(8.dp)// Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
            var cid by remember { mutableStateOf("") }
            TextField(
                value = cid,
                onValueChange = { cid = it },
                label = { Text("Cidade:") }
            )
        }
        //linha e caixa de texto de estado
        Row(
            Modifier
                .padding(8.dp)// Adicionando um espaço de 8 pixels em todas as direções da linha.
        ) {
            var estado by remember { mutableStateOf("") }
            TextField(
                value = estado,
                onValueChange = { estado = it },
                label = { Text("Estado:") }
            )
        }
        //Botão
        Row(
            Modifier

                .fillMaxWidth(), //A linha deve ocupar toda a largura disponível do contêiner pai(tela).
            Arrangement.Center // Alinha os elementos da linha absolutamente à direita dentro do espaço disponível.
        ) {
            Button(
                onClick = { /*TODO*/ } // Define a ação a ser executada quando o botão for clicado.

            ) {
                Text(text = "Cadastrar",// Definindo o texto que será exibido dentro do botão.
                    style = TextStyle(
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                    )
                )
            }
        }

    }
}
@Composable
@Preview
fun cadastroPreviem(){
    CadastroTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            cadastro()
        }
    }
}