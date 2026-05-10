/*
Crear un programa que permita calcular el área de 4 figuras, 
mostrara un menú para elegir la figura a calcular el área, 
pedirá los valores necesarios y mostrara el resultado, 
a continuación, mostrara nuevamente el menú termina al elegir opción 5
 */

 import kotlin.math.PI

fun main() {
    var opcion: Int
    do {
        println("\nFiguras UwU")
        println("1. Cuadrado")
        println("2. Circulo")
        println("3. Triangulo")
        println("4. Rectangulo")
        println("5. Salir")
        println("Elige una opcion:")
        
        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> cuadrado()
            2 -> circulo()
            3 -> triangulo()
            4 -> rectangulo()
            5 -> println("Adiooos!...")
            else -> println("Opcion no valida.")
        }
    } while (opcion != 5)
}

fun cuadrado() {
    println("Ingresa longitud del lado:")
    val lado = readln().toDouble()
    val area = lado * lado
    println("El area del cuadrado es: $area")
}

fun circulo() {
    println("Ingresa longitud del radio:")
    val radio = readln().toDouble()
    val area = PI * radio * radio
    println("El area del circulo es: $area")
}

fun triangulo() {
    println("Ingresa longitud de la base:")
    val base = readln().toDouble()
    println("Ingresa longitud de la altura:")
    val altura = readln().toDouble()
    val area = (base * altura) / 2
    println("El area del triangulo es: $area")
}

fun rectangulo() {
    println("Ingresa longitud de la base:")
    val base = readln().toDouble()
    println("Ingresa longitud de la altura:")
    val altura = readln().toDouble()
    val area = base * altura
    println("El area del rectangulo es: $area")
}