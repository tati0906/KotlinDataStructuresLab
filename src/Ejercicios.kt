// Reto 1: Control de Gastos Diarios
fun reto1ControlGastos() {
    println("\n  Reto 1: Control de Gastos Diarios")
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
// Reto 2: Filtro de Empleados Senior
fun reto2FiltroEmpleados() {
    println("\n Reto 2: Filtro de Empleados Senior")
    val empleados = listOf(
        Pair("Ana", 35), Pair("Carlos", 28), Pair("María", 42),
        Pair("Luis", 31), Pair("Sofía", 55), Pair("Pedro", 29),
        Pair("Laura", 38), Pair("Jorge", 27), Pair("Carmen", 48),
        Pair("Diego", 33)
    )
    val seniors = mutableListOf<String>()
    for (emp in empleados) {
        if (emp.second > 30) {
            seniors.add(emp.first.uppercase())
        }
    }
    println("Empleados mayores de 30 años (en mayúsculas): $seniors")
}