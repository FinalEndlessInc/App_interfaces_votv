package com.placeholder.interfacez.ui.moleculas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.placeholder.interfacez.ui.pantallas.pantallaFiltro

var columnas_p: Int = 140

@Composable
fun apartadoFiltro(nombre_filtro: String, fondo: Color = Color.Black){
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(fondo)
            .border(1.dp, Color.White, shape = RectangleShape)
            .padding(3.dp)
        ){
            Column (modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .border(5.dp, Color.White, shape = CircleShape)

            ){

            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.White, shape = RectangleShape)
                //.padding(3.dp)
            ){
                Row {
                    Text( nombre_filtro,
                        color = Color.White,
                        fontFamily = FontFamily.Monospace
                    )
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.White, shape = RectangleShape)
                ) {
                    Column(modifier = Modifier .width(columnas_p.dp)){
                        Text( text = "Filter offset:",
                            color = Color.White,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                    Column {
                        Text( text = "0.00 deg",
                            color = Color.White,
                            fontFamily = FontFamily.Monospace
                        )
                    }

                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.White, shape = RectangleShape)
                ){
                    Column(modifier = Modifier .width(columnas_p.dp)){
                        Text( text = "Offset speed:",
                            color = Color.White,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                    Column {
                        Text( text = "0.00 d/s",
                            color = Color.White,
                            fontFamily = FontFamily.Monospace
                        )
                    }

                }
                Row {
                    Column(modifier = Modifier .width(columnas_p.dp)){
                        Text( text = "Output data:",
                            color = Color.Yellow,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                    Column {
                        Text( text = "0.0 %",
                            color = Color.Yellow,
                            fontFamily = FontFamily.Monospace
                        )
                    }

                }
            }
        }
}

@Preview
@Composable
fun PreviewPantalla(){
    apartadoFiltro("Polaroid filter:")
}