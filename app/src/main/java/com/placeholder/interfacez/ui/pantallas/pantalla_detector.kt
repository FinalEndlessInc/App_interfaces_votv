package com.placeholder.interfacez.ui.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

var modificadorRow = Modifier
    .fillMaxWidth()
    .border(1.dp, Color.White, shape = RectangleShape)
    .padding(10.dp,5.dp)

var modificadorColumna = Modifier
    .fillMaxWidth()
    .border(3.dp, color = Color.White, shape = RectangleShape)
    .padding(5.dp)

var ColumnaP: Int = 250


var FilasP: Int = 45

@Composable
fun PantallaDetector(modificador: Modifier = Modifier){
    Column(modifier = modificadorColumna
        .background(Color.Black)

    ) {
        //-----------------Grande
        Row(modifier = modificadorRow
            .height(442.dp)
            .background(Color.DarkGray)
        ){
            Text(
                text = "NO SIGNAL",
                color = Color.Red
            )
        }
        //-----------------1
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Detector status:",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "100.0%",
                    color = Color.Green,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }

        }
        //-----------------2
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Object:",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "dwarf_planet",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }
        }
        //-----------------3
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Signal quality:",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "great",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }
        }
        //-----------------4
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Signal frequency:",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "average",
                    color = Color.White,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }
        }
        //-----------------5
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Efficiency:",
                    color = Color.Yellow,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "0.444 B/s",
                    color = Color.Yellow,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }
        }
        //-----------------6
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Energy consumption:",
                    color = Color.Cyan,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "99.82%",
                    color = Color.Cyan,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }
        }
        //-----------------7
        Row(modifier = modificadorRow
            .height(FilasP.dp)
        ){
            Column( modifier = modificador
                .width(ColumnaP.dp)
            ){
                Text(
                    text = "Downloaded:",
                    color = Color.Green,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Left
                )
            }
            Column{
                Text(
                    text = "0.0%",
                    color = Color.Green,
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Right
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewDetector(){
    PantallaDetector()
}