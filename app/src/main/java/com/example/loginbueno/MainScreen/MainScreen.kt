package com.example.loginbueno.MainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginbueno.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun Main(
    LogIn: () -> Unit
){
    var email by remember {
        mutableStateOf("")
    }

    var pass by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.xd),
            contentDescription = "Login image",
            modifier = Modifier.size(100.dp)
            )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Bienvenido", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange ={email = it}, label = { Text(text = "Email")} )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = pass, onValueChange = {pass = it}, label = { Text(text = "Password")}, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {LogIn()}) {
            Text(text = "Log in")

        }
        Spacer(modifier = Modifier.height(16.dp))
        
        Text(text = "")
    }
}