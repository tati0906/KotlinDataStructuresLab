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

// Reto 3: Limpieza de Contactos Duplicados
fun reto3LimpiezaContactos() {
    println("\n Reto 3: Limpieza de Contactos Duplicados ")
    val numerosRaw = listOf(
        3001234567, 3009876543, 3001234567, 3015551234,
        3009876543, 3022223333, 3015551234, 3031112222,
        3044445555, 3022223333, 3056667777, 3031112222,
        3001234567, 3068889999, 3044445555, 3071110000,
        3082221111, 3056667777, 3093332222, 3004445566
    )
    val unicos = mutableSetOf<Long>()
    for (n in numerosRaw) unicos.add(n.toLong())
    val ordenados = unicos.sorted()
    println("Números únicos ordenados (${ordenados.size}):")
    for (n in ordenados) println("  $n")
}

// Reto 4: Análisis de Carrito de Compras
fun reto4CarritoCompras() {
    println("\n Reto 4: Análisis de Carrito de Compras ")
    val productos = listOf(
        "Manzana", "Leche", "Manzana", "Pan", "Leche",
        "Leche", "Manzana", "Jugo", "Pan", "Manzana"
    )
    val conteo = mutableMapOf<String, Int>()
    for (p in productos) {
        conteo[p] = (conteo[p] ?: 0) + 1
    }
    println("Unidades por producto:")
    for ((prod, cant) in conteo) println("  $prod: $cant unidades")
}

// Reto 5: Historial de Navegación Reversible
fun reto5HistorialNavegacion() {
    println("\n Reto 5: Historial de Navegación Reversible ")
    val historial = arrayOf(
        "google.com", "github.com", "kotlinlang.org",
        "stackoverflow.com", "anthropic.com"
    )
    val invertido = Array(historial.size) { "" }
    var izq = 0; var der = historial.size - 1
    val temp = historial.copyOf()
    while (izq < der) {
        val aux = temp[izq]; temp[izq] = temp[der]; temp[der] = aux
        izq++; der--
    }
    println("Historial invertido (botón Atrás):")
    for (url in temp) println("  <- $url")
}

// Reto 6: Compatibilidad de Intereses
fun reto6CompatibilidadIntereses() {
    println("\n Reto 6: Compatibilidad de Intereses (Match) ")
    val persona1 = setOf("Lectura", "Ciclismo", "Cocina", "Viajes", "Fotografía")
    val persona2 = setOf("Ciclismo", "Música", "Viajes", "Pintura", "Lectura")
    val comunes = persona1.intersect(persona2)
    val exclusivosP1 = persona1.subtract(persona2)
    println("Pasatiempos en común: $comunes")
    println("Exclusivos de persona 1: $exclusivosP1")
}