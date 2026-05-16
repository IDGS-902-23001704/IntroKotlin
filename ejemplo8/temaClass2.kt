class Persona constructor(nombre: String, edad: Int)
{
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir()
    {
        println("Nombre: $nombre y tiene una edad $edad")
    }

    fun esMayorEdad()
    {
        if (edad >= 18)
            println("Es mayor de edad: $nombre")
        else
            println("Es menor de edad: $nombre")
    }

    
}

fun main(parametro: Array<String>)
{
    val persona1 = Persona("Juan", 19)
    persona1.imprimir()
    persona1.esMayorEdad()
}