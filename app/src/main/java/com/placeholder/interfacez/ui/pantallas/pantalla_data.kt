package com.placeholder.interfacez.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

var Columna1 = Modifier
    .fillMaxWidth(.68f)



@Composable
fun pantallaData(modificador: Modifier = Modifier){
    Column(modifier = Modifier
        .background(Color.Black)
        .fillMaxWidth()
    ){
        Row {
            Text(
                text = "[UPLOAD DATA]",
                fontFamily = FontFamily.Monospace,
                color = Color.Red
            )
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta)
            .border(1.dp, color = Color.Magenta, shape = RectangleShape)
            .padding(5.dp)

        ){
            Text(text = "||||||||||||||||||||||||||")
        }
        Row(modifier = Modifier
            .border(1.dp, color = Color.White, shape = RectangleShape)
        ){
            Column(modifier = Modifier
                .fillMaxWidth(.5f)
                .border(1.dp, color = Color.White, shape = RectangleShape)
            ){
                Row {
                    Column( modifier = Columna1

                    ) {
                        Text(
                            text = "Progress: ",
                            color = Color.Green
                        )
                    }
                    Column() {
                        Text(
                            text = "0.000%",
                            color = Color.Green
                        )
                    }

                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.White, shape = RectangleShape)
                ){
                    Column( modifier = Columna1

                    ) {
                        Text(
                            text = "Efficiency: ",
                            color = Color.Yellow
                        )
                    }
                    Column() {
                        Text(
                            text = "0.000 B/s",
                            color = Color.Yellow
                        )
                    }
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.White, shape = RectangleShape)
                ) {
                    Column( modifier = Columna1

                    ) {
                        Text(
                            text = "Energy consumption: ",
                            color = Color.Cyan
                        )
                    }
                    Column() {
                        Text(
                            text = "100.00%",
                            color = Color.Cyan
                        )
                    }
                }
                Row {
                    Column( modifier = Columna1

                    ) {
                        Text(
                            text = "File size: ",
                            color = Color.White
                        )
                    }
                    Column() {
                        Text(
                            text = "0.0000MB",
                            color = Color.White
                        )
                    }
                }
            }
            Column( modifier = Modifier
                .fillMaxWidth()

            ){
                Row {
                    Text(
                        text = "Process:",
                        color = Color.Cyan
                    )
                    Text(
                        text = "IDLE",
                        color = Color.Cyan
                    )
                }
                Row {
                    Text(
                        text = "Pinging... status: [FINE]",
                        color = Color.Magenta

                    )
                }
                Row {
                    Text(
                        text = "Pinging... status: [FINE]",
                        color = Color.Magenta

                    )
                }
                Row {
                    Text(
                        text = "Pinging... status: [FINE]",
                        color = Color.Magenta

                    )
                }
            }
        }
    }
}



@Preview
@Composable
fun dataPreview(){
    pantallaData()
}