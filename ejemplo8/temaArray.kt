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