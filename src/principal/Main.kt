package principal

import logicaCajero.Cajero

fun main() {
    val cajero = Cajero(500.0)
    var salir = false

    // El menú se repite hasta que el usuario selecciona salir
    while (!salir) {
        cajero.mostrarMenu()

        when (cajero.leerOpcion()) {
            1 -> cajero.consultarSaldo()
            2 -> cajero.ingresarDinero()
            3 -> cajero.retirarDinero()
            4 -> {
                cajero.despedida()
                salir = true
            }
            else -> cajero.opcionNoValida()
        }
    }
}