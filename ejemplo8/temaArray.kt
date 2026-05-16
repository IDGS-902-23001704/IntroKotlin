/*
----tipo------Arreglo----
int           IntArray
Double        DoubleArray
Float         FloatArray
Boolean       BooleanArray  

 */


 fun main(){
    //numeros
    val numeros = arrayOf(1,2,3,4,5)
    println(numeros[0])
    //cadenas

    val nombres = arrayOf("Ana", "Luis", "Carlos")
    println(nombres[1])

    //Recorrer arreglos

        val frutas = arrayOf("Manzana", "Para", "Uva")

    for (fruta in frutas)
    {
        println(fruta)
    }

    //arreglo vacio
    val numeros = Array(5) {0}

    //matriz
    val matriz = arrayOf(
        arrayOf(1,2),
        arrayOf(3,4)
    )

 }


 


/* 

Suma de dos matrices Programa que permita al usuario ingresar por teclado 
valores de dos matrices de 3x3 y posteriormente realizar la suma de ambas 
matrices mostrando el resultado en la pantalla

Se crean tres matrices 
- matriz1 para almacenar primera matriz
- matriz2 para almacenar segunda matriz
- reultado para guardar la suma

--*/