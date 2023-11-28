package com.example.base

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.MaterialTheme
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun registerStudent(navController: NavHostController){

    val nomeAluno = remember { mutableStateOf("")}
    val nomeResponsavel = remember { mutableStateOf("")}
    val cursoMatriculado = remember { mutableStateOf("")}

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "CADASTRAR ALUNO",
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
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Text(
                text = "Digite os dados do Aluno",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(8.dp)
                    .wrapContentSize(Alignment.Center)
            )
            TextField(
                value = nomeAluno.value, onValueChange = { nomeAluno.value = it},
                label = { Text("Nome do Aluno")},
                modifier = Modifier.padding(16.dp)
            )
            TextField(
                value = nomeResponsavel.value, onValueChange = { nomeResponsavel.value = it},
                label = { Text("Nome do Responsável")},
                modifier = Modifier.padding(16.dp)
            )
            TextField(
                value = cursoMatriculado.value, onValueChange = { cursoMatriculado.value = it},
                label = { Text("Curso Matriculado")},
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
                        fontFamily = FontFamily.SansSerif,
                    )
                }
                Button(
                    onClick = { navController.navigate(Destination.registerCourse.route) },
                    modifier = Modifier
                        .padding(16.dp)

                ) {
                    Text(
                        text = "Cadastrar Curso",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif,
                    )
                }
            }
        }
    }
}