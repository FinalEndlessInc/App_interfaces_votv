package com.placeholder.interfacez.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PantallaDetector(modificador: Modifier = Modifier){
    Column(modifier = modificador
        .background(Color.Blue)
        .fillMaxWidth()
    ) {
        Text( "Que funcioneee")
    }
}

@Preview
@Composable
fun PreviewDetector(){
    PantallaDetector()
}