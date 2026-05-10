fun mostrarMayor(v1: Int, v2: Int, v3: Int) {
    if (v1 >= v2 && v1 >= v3) {
        println("El número mayor es: $v1")
    } 
    else if (v2 >= v1 && v2 >= v3) {
        println("El número mayor es: $v2")
    } 
    else {
        println("El número mayor es: $v3")
    }
}

fun retornarMayor(v1: Int, v2:Int) : Int 
{
    if (v1 > v2)
    {
        return v1
    }else
    {
        return v2
    }
}


fun limpiarPantalla() {
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}


fun main() {
    limpiarPantalla()
    
    println("Ingresa primer valor:")
    val valor1 = readln().toInt()
    
    println("Ingresa segundo valor:")
    val valor2 = readln().toInt()
    
    println("Ingresa tercer valor:")
    val valor3 = readln().toInt()

    mostrarMayor(valor1, valor2, valor3)
}

/*
Crear un programa que permita calcular el área de 4 figuras, 
mostrara un menú para elegir la figura a calcular el área, 
pedirá los valores necesarios y mostrara el resultado, 
a continuación, mostrara nuevamente el menú termina al elegir opción 5
 */