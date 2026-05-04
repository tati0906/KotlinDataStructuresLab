//  Ejercicios.kt  –  30 Retos de Kotlin: Soluciones para la Vida Real
//  Sesión 3: Colecciones y Estructuras de Datos

// ─── Reto 1: Control de Gastos Diarios ───────────────────────
fun reto1ControlGastos() {
    println("\n=== Reto 1: Control de Gastos Diarios ===")
    val gastos = arrayOf(
        12000.0, 45000.0, 8500.0, 32000.0, 15000.0,
        27000.0, 9000.0, 50000.0, 3000.0, 21000.0,
        18000.0, 40000.0, 11000.0, 7500.0, 33000.0
    )
    var total = 0.0
    var maximo = gastos[0]
    var minimo = gastos[0]
    for (g in gastos) {
        total += g
        if (g > maximo) maximo = g
        if (g < minimo) minimo = g
    }
    val promedio = total / gastos.size
    println("Total: $$total")
    println("Promedio diario: $$promedio")
    println("Gasto más alto: $$maximo")
    println("Gasto más bajo: $$minimo")
}