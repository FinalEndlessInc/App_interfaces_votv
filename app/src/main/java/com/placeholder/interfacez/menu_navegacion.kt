package com.placeholder.interfacez

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.placeholder.interfacez.ui.pantallas.PantallaDetector
import com.placeholder.interfacez.ui.pantallas.pantallaPrincipal

public enum class Pantallas{
    pantalla_1,
    pantalla_2,
    pantalla_3
}

@Composable
fun PantallaNavegacion(modificador: Modifier = Modifier){
    var mostrar_pantalla: Pantallas by remember {
        mutableStateOf(Pantallas.pantalla_1)
    }

    when(mostrar_pantalla){
        //pantallaPrincipal(modificador)
        Pantallas.pantalla_1 -> pantallaPrincipal(modificador)
        Pantallas.pantalla_2 -> PantallaDetector(modificador)
        Pantallas.pantalla_3 -> TODO()
    }

    Button(onClick = {
        when(mostrar_pantalla){

            Pantallas.pantalla_1 -> {
                mostrar_pantalla = Pantallas.pantalla_2

            }
            Pantallas.pantalla_2 -> {
                mostrar_pantalla = Pantallas.pantalla_3
            }
            Pantallas.pantalla_3 -> {
                mostrar_pantalla = Pantallas.pantalla_1
            }
        }
    }, modifier = modificador) {
        Text("Cambiar pantalla")
    }

}