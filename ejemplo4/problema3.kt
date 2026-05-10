/*Problema3: Un controlador PLC bloquea el acceso tras 3 intentos fallidos de ingresar
una clave de seguridad. */ 

fun main() {
    val claveCorrecta = "Limones69"
    var intentosFallidos = 0

    while (intentosFallidos < 3) {
        println("Ingrese la clave de seguridad del PLC:")
        val claveIngresada = readln()

        if (claveIngresada == claveCorrecta) {
            println("Acceso concedido al sistema.")
            break
        } else {
            intentosFallidos++
            println("Clave incorrecta. Intentos fallidos: $intentosFallidos/3")
        }
    }

    if (intentosFallidos == 3) {
        println("ALERTA: Controlador PLC bloqueado por seguridad.")
    }
}