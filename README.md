# UD01_Actividad05_CajeroAutomatico

Aplicación de consola en **Kotlin** que simula el funcionamiento básico de un cajero automático. Proyecto de la asignatura **PMDM** (Programación Multimedia y Dispositivos Móviles), unidad *UD01. Introducción*.

## Descripción

El programa parte de un saldo inicial de **500.0 €** y muestra un menú interactivo que se repite hasta que el usuario decide salir. Permite consultar el saldo, ingresar dinero y retirar dinero, validando en todo momento los datos introducidos.

## Funcionalidades

- **Consultar saldo:** muestra el saldo actual.
- **Ingresar dinero:** suma una cantidad al saldo (debe ser mayor que cero).
- **Retirar dinero:** resta una cantidad al saldo (debe ser mayor que cero y no superar el saldo disponible).
- **Salir:** finaliza el programa de forma controlada.

### Validaciones

- Opciones no válidas del menú (números fuera de rango o texto).
- Ingresos de importe negativo, cero o con texto no numérico.
- Retiradas de importe negativo, cero o con texto no numérico.
- Retiradas superiores al saldo disponible.
- Aceptación de punto o coma como separador decimal (`25.5` o `25,5`).

## Estructura del proyecto

```
UD01_Actividad05_CajeroAutomatico/
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt     # Punto de entrada: bucle del menú y when
            └── Cajero.kt   # Clase Cajero: saldo y operaciones
```

- **`Main.kt`**: crea el objeto `Cajero`, repite el menú con un `while` y dirige cada opción con un `when`.
- **`Cajero.kt`**: contiene la clase `Cajero`, con el saldo (privado) y las funciones de menú, consulta, ingreso, retirada y validación.

## Requisitos

- IntelliJ IDEA o cualquier otro IDE
- JDK 17 o superior
- Kotlin 1.6 o superior (necesario para `readlnOrNull()`)

## Cómo ejecutarlo

1. Clona el repositorio.
2. Abre la carpeta del proyecto en el IDE.
3. Espera a que termine la sincronización de Gradle.
4. Abre `Main.kt` y pulsa el botón verde de ejecución.

## Ejemplo de uso

```
===== CAJERO AUTOMÁTICO =====
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Seleccione una opción: 1
Su saldo actual es: 500.0 €

===== CAJERO AUTOMÁTICO =====
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Seleccione una opción: 3
Introduzca la cantidad a retirar: 800
Error: saldo insuficiente.

===== CAJERO AUTOMÁTICO =====
1. Consultar saldo
2. Ingresar dinero
3. Retirar dinero
4. Salir
Seleccione una opción: 4
Gracias por utilizar el cajero automático. ¡Hasta pronto!
```

## Conceptos practicados

- Variables y tipos (`var`, `Double`, `Int?`)
- Estructuras condicionales (`if /else if / else`)
- Expresión `when`
- Bucles (`while`)
- Clases y funciones
- Entrada por consola (`readlnOrNull()`) y tipos *nullable* (`?.`, `toIntOrNull()`, `toDoubleOrNull()`)

## Autor

**Raúl Talbi Daza**
Ilerna · PMDM · UD01 – Actividad 05
