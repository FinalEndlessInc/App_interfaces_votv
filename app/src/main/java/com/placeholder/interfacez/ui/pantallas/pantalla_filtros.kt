package com.placeholder.interfacez.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.placeholder.interfacez.ui.moleculas.apartadoFiltro

@Composable
fun pantallaFiltro(modificador: Modifier = Modifier){
    Column(modifier = modificadorColumna
        .background(Color.Black)

    ) {
        apartadoFiltro("Polarity filter:")
        apartadoFiltro("Frequency filter:")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantalla(){
    pantallaFiltro()
}