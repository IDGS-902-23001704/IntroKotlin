/* Problema2: Una batería comienza con 1(81%1) de carga. Un cargador añade \(15\%\) cada minuto. Se debe detener el ciclo cuando la 
carga llegue o supere el \(200\%\).*/

fun main() {
    var carga = 81
    var minutos = 0

    while (carga < 200) {
        carga += 15
        minutos++
        println("Minuto $minutos = Nivel de carga al $carga%")
    }

    println("Ciclo de carga finalizado. Carga total = $carga%")
}