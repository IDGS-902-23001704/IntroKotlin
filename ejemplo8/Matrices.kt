/* 

Suma de dos matrices Programa que permita al usuario 
ingresar por teclado valores de dos matrices de 3x3 y 
posteriormente realizar la suma de ambas matrices 
mostrando el resultado en la pantalla

Se crean tres matrices 
- matriz1 para almacenar primera matriz
- matriz2 para almacenar segunda matriz
- reultado para guardar la suma

--*/

fun main() 
{
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println("SUMA DE MATRICES")

    println("Ingresa valores para matriz 1")
    for (fila in 0..2) {
        for (columna in 0..2) {
            print("Valor para la fila $fila, columna $columna: ")
            matriz1[fila][columna] = readln().toInt()
        }
    }

    println("Ingresa valores para matriz 2")
    for (fila in 0..2) {
        for (columna in 0..2) {
            print("Valor para la fila $fila, columna $columna: ")
            matriz2[fila][columna] = readln().toInt()
        }
    }

    for (fila in 0..2) {
        for (columna in 0..2) {
            resultado[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna]
        }
    }


    println("\nEl resultado de la suma es:")
    for (fila in 0..2) {
        for (columna in 0..2) {
            print("${resultado[fila][columna]} ")
        }
        println()
    }
}