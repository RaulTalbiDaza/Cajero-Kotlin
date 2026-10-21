package logicaCajero

// Clase Cajero para contener toda la lógica

class Cajero(saldoInicial: Double = 500.0){

    // Inicializo una variable saldo al principio

    private var saldo = saldoInicial

    // Función para mostar el menú principal

    fun mostrarMenu(){
        println()
        println("===== CAJERO AUTOMÁTICO =====")
        println("1. Consultar saldo")
        println("2. Ingresar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        print("Seleccione una opción: ")
    }

    // Función para leer la opción del menú y devuelve null si no es un número entero

    fun leerOpcion(): Int?{
        return readlnOrNull()?.trim()?.toIntOrNull()
    }

    // Lee una cantidad por consola, devuelve null si no es un número válido y acepta punto o coma decimal

    private fun leerCantidad(mensaje: String): Double? {
        print(mensaje)
        return readlnOrNull()?.trim()?.replace(',', '.')?.toDoubleOrNull()
    }

    // Función para que consulta el saldo

    fun consultarSaldo(){
        println("Su saldo actual es: $saldo €")
    }

    // Función para ingresar el dinero

    fun ingresarDinero(){
        val cantidad = leerCantidad("Introduzca la cantidad a ingresar: ")

        if (cantidad == null) {
            println("Error: debe introducir un número válido.")
        } else if (cantidad <= 0) {
            println("Error: la cantidad debe ser mayor que cero.")
        } else {
            saldo += cantidad
            println("Ingreso realizado correctamente. Nuevo saldo: $saldo €")
        }
    }

    // Función para retirar el dinero

    fun retirarDinero() {
        val cantidad = leerCantidad("Introduzca la cantidad a retirar: ")

        if (cantidad == null) {
            println("Error: debe introducir un número válido.")
        } else if (cantidad <= 0) {
            println("Error: la cantidad debe ser mayor que cero.")
        } else if (cantidad > saldo) {
            println("Error: saldo insuficiente.")
        } else {
            saldo -= cantidad
            println("Retirada realizada correctamente. Nuevo saldo: $saldo €")
        }
    }

    // Función con el mensaje para opciones no válidas

    fun opcionNoValida() {
        println("Error: opción no válida. Elija un número del 1 al 4.")
    }

    // Función para el mensaje de despedida

    fun despedida() {
        println("Gracias por utilizar el cajero automático. ¡Hasta pronto!")
    }
}