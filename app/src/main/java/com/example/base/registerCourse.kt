package com.example.base

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun registerCourse(navController: NavHostController){
    val nomeCurso = remember { mutableStateOf("") }
    val descricaoCurso = remember { mutableStateOf("") }
    val coordenadorCurso = remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "CADASTRAR CURSO",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(8.dp)
                            .wrapContentSize(Alignment.Center)
                    )
                },
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Text(
                text = "Digite os dados do Curso",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(8.dp)
                    .wrapContentSize(Alignment.Center)
            )
            TextField(
                value = nomeCurso.value, onValueChange = { nomeCurso.value = it},
                label = { Text("Nome do Curso")},
                modifier = Modifier.padding(16.dp)
            )
            TextField(
                value = descricaoCurso.value, onValueChange = { descricaoCurso.value = it},
                label = { Text("Descrição do Curso")},
                modifier = Modifier.padding(16.dp)
            )
            TextField(
                value = coordenadorCurso.value, onValueChange = { coordenadorCurso.value = it},
                label = { Text("Coordenador")},
                modifier = Modifier.padding(16.dp)
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Salvar",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = { navController.navigate(Destination.homePage.route) },
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Home",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,)
                }
                Button(
                    onClick = { navController.navigate(Destination.registerStudent.route) },
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Cadastrar Aluno",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                    )
                }
            }
        }
    }
}