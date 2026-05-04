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

// Reto 7: Inventario de Despensa
fun reto7InventarioDespensa() {
    println("\n Reto 7: Inventario de Despensa ")
    val despensa = mutableMapOf(
        "Arroz" to 5, "Frijoles" to 3, "Aceite" to 2,
        "Sal" to 1, "Azúcar" to 4
    )
    println("Despensa inicial: $despensa")
    // Consumir productos
    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: 0
        val nueva = actual - cantidad
        if (nueva <= 0) {
            despensa.remove(producto)
            println("¡ALERTA! '$producto' se ha agotado y fue eliminado.")
        } else {
            despensa[producto] = nueva
            println("Consumido $cantidad de '$producto'. Quedan: $nueva")
        }
    }
    consumir("Arroz", 3)
    consumir("Sal", 1)
    consumir("Frijoles", 1)
    println("Despensa final: $despensa")
}

// Reto 8: Cálculo de Promedio Académico
fun reto8PromedioAcademico() {
    println("\n Reto 8: Cálculo de Promedio Académico ")
    val calificaciones = listOf(
        Pair(4.5, 0.30), Pair(3.8, 0.20),
        Pair(4.2, 0.25), Pair(3.5, 0.15), Pair(5.0, 0.10)
    )
    var notaFinal = 0.0
    for ((nota, peso) in calificaciones) {
        notaFinal += nota * peso
    }
    println("Nota final definitiva: ${"%.2f".format(notaFinal)}")
}

// Reto 9: Traductor de Códigos de País
fun reto9TraductorPaises() {
    println("\n Reto 9: Traductor de Códigos de País ")
    val paises = mapOf(
        "CO" to "Colombia", "MX" to "México",
        "AR" to "Argentina", "US" to "Estados Unidos",
        "ES" to "España"
    )
    for ((iso, nombre) in paises) {
        println("El código [$iso] pertenece a [$nombre]")
    }
}

// Reto 10: Rotación de Turnos de Trabajo
fun reto10RotacionTurnos() {
    println("\n Reto 10: Rotación de Turnos de Trabajo ")
    val empleados = mutableListOf("Ana", "Beto", "Carlos", "Diana", "Eva", "Felipe", "Gina")
    val k = 2
    println("Turno original: $empleados")
    val n = empleados.size
    val rotados = MutableList(n) { "" }
    for (i in 0 until n) {
        rotados[(i + k) % n] = empleados[i]
    }
    println("Turno rotado $k posiciones: $rotados")
}

// Reto 11: Organizador de Maleta
fun reto11OrganizadorMaleta() {
    println("\n Reto 11: Organizador de Maleta ")
    val objetos = listOf(
        Pair("Laptop", 2.5f), Pair("Ropa", 1.2f), Pair("Zapatos", 0.8f),
        Pair("Libros", 3.0f), Pair("Neceser", 0.5f), Pair("Cámara", 1.5f)
    )
    val limiteAerolinea = 2.0f
    val maleta = mutableMapOf<Int, MutableList<String>>()
    for ((obj, peso) in objetos) {
        val pesoKey = (peso * 10).toInt()
        val clave = if (peso <= limiteAerolinea) pesoKey else pesoKey + 100
        maleta.getOrPut(clave) { mutableListOf() }.add("$obj(${peso}kg)")
    }
    println("Objetos dentro del límite (≤${limiteAerolinea}kg):")
    for ((_, lista) in maleta) {
        for (item in lista) {
            val p = item.substringAfter("(").substringBefore("kg)").toFloat()
            if (p <= limiteAerolinea) println("  ✓ $item")
        }
    }
    println("Objetos sobre el límite:")
    for ((_, lista) in maleta) {
        for (item in lista) {
            val p = item.substringAfter("(").substringBefore("kg)").toFloat()
            if (p > limiteAerolinea) println("  ✗ $item")
        }
    }
}

// Reto 12: Verificador de Ruta Reversible
fun reto12RutaReversible() {
    println("\n Reto 12: Verificador de Ruta Reversible ")
    fun esPalindromo(ruta: List<Pair<Int, Int>>): Boolean {
        val n = ruta.size
        for (i in 0 until n / 2) {
            if (ruta[i] != ruta[n - 1 - i]) return false
        }
        return true
    }
    val ruta1 = listOf(Pair(0,0), Pair(1,2), Pair(3,4), Pair(1,2), Pair(0,0))
    val ruta2 = listOf(Pair(0,0), Pair(1,2), Pair(3,4), Pair(5,6))
    println("Ruta 1 $ruta1 → ¿Es espejo? ${esPalindromo(ruta1)}")
    println("Ruta 2 $ruta2 → ¿Es espejo? ${esPalindromo(ruta2)}")
}

// Reto 13: Reparto de Pedidos por Camión
fun reto13RepartoPedidos() {
    println("\n Reto 13: Reparto de Pedidos por Camión ")
    val paquetes = (1..50).toList()
    val tamanoLote = 10
    var camion = 1
    var i = 0
    while (i < paquetes.size) {
        val lote = mutableListOf<Int>()
        for (j in i until minOf(i + tamanoLote, paquetes.size)) {
            lote.add(paquetes[j])
        }
        println("Camión $camion: paquetes $lote")
        i += tamanoLote
        camion++
    }
}

// Reto 14: Identificador de Ticket Único
fun reto14TicketUnico() {
    println("\n Reto 14: Identificador de Ticket Único ")
    val tickets = listOf(101, 202, 303, 101, 404, 202, 505, 606, 303, 707)
    val conteo = mutableMapOf<Int, Int>()
    for (t in tickets) conteo[t] = (conteo[t] ?: 0) + 1
    var primerUnico = -1
    for (t in tickets) {
        if (conteo[t] == 1) { primerUnico = t; break }
    }
    println("Tickets: $tickets")
    println("Primer ID único (no repetido): $primerUnico")
}

// Reto 15: Calculadora de IVA Selectiva
fun reto15IVASelectiva() {
    println("\n Reto 15: Calculadora de IVA Selectiva ")
    val precios = mapOf(
        "Televisor" to 1200000, "Leche" to 3500,
        "Celular" to 850000, "Pan" to 4200,
        "Laptop" to 2500000, "Jabón" to 8000
    )
    val umbral = 50000
    val iva = 0.19
    val preciosConIVA = mutableMapOf<String, Double>()
    for ((prod, precio) in precios) {
        if (precio > umbral) {
            preciosConIVA[prod] = precio * (1 + iva)
        }
    }
    println("Productos con IVA del 19% (precio > \$$umbral):")
    for ((prod, precio) in preciosConIVA) {
        println("  $prod: \$${"%.0f".format(precio)}")
    }
}

// Reto 16: Mantenimiento de Sensores
fun reto16MantenimientoSensores() {
    println("\n Reto 16: Mantenimiento de Sensores ")
    val sensores = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
    println("Sensores iniciales: $sensores")
    val iterator = sensores.iterator()
    while (iterator.hasNext()) {
        val id = iterator.next()
        if (id % 3 == 0) iterator.remove()
    }
    println("Sensores activos (sin múltiplos de 3): $sensores")
}

// Reto 17: Mapa de Almacén (Matriz)
fun reto17MapaAlmacen() {
    println("\n Reto 17: Mapa de Almacén (Matriz 4x4) ")
    val almacen = arrayOf(
        intArrayOf(5, 2, 8, 1),
        intArrayOf(3, 7, 4, 6),
        intArrayOf(9, 1, 3, 2),
        intArrayOf(4, 6, 5, 8)
    )
    var diagPrincipal = 0; var diagSecundaria = 0
    val n = almacen.size
    for (i in 0 until n) {
        diagPrincipal += almacen[i][i]
        diagSecundaria += almacen[i][n - 1 - i]
    }
    println("Diagonal principal (pasillo central): $diagPrincipal")
    println("Diagonal secundaria: $diagSecundaria")
}

// Reto 18: Fusión de Recetas
fun reto18FusionRecetas() {
    println("\n Reto 18: Fusión de Recetas ")
    val chef1 = mapOf("Harina" to 2.5, "Azúcar" to 1.0, "Mantequilla" to 0.5)
    val chef2 = mapOf("Harina" to 1.5, "Leche" to 0.8, "Azúcar" to 0.5, "Huevos" to 0.3)
    val listaCompras = mutableMapOf<String, Double>()
    for ((ing, cant) in chef1) listaCompras[ing] = (listaCompras[ing] ?: 0.0) + cant
    for ((ing, cant) in chef2) listaCompras[ing] = (listaCompras[ing] ?: 0.0) + cant
    println("Lista de compras combinada:")
    for ((ing, cant) in listaCompras) println("  $ing: ${"%.1f".format(cant)} kg")
}

// Reto 19: Ranking de Apps por Calificación
fun reto19RankingApps() {
    println("\n Reto 19: Ranking de Apps por Calificación ")
    val apps = mutableListOf(
        Pair("AppA", 4.2), Pair("AppB", 4.8), Pair("AppC", 3.9),
        Pair("AppD", 4.5), Pair("AppE", 4.1), Pair("AppF", 4.7),
        Pair("AppG", 3.5), Pair("AppH", 4.9), Pair("AppI", 4.3),
        Pair("AppJ", 4.6), Pair("AppK", 3.8), Pair("AppL", 4.4)
    )
    // Ordenamiento burbuja manual (mayor a menor)
    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]; apps[j] = apps[j + 1]; apps[j + 1] = temp
            }
        }
    }
    println("Top 10 Apps:")
    for (i in 0 until minOf(10, apps.size)) {
        println("  ${i + 1}. ${apps[i].first} - ★${apps[i].second}")
    }
}

// Reto 20: Unión de Agendas Ordenadas
fun reto20UnionAgendas() {
    println("\n Reto 20: Unión de Agendas Ordenadas ")
    val agenda1 = listOf("Ana", "Carlos", "María", "Pedro")
    val agenda2 = listOf("Beatriz", "Diana", "Luis", "Sofía", "Zoe")
    val unidos = mutableListOf<String>()
    unidos.addAll(agenda1); unidos.addAll(agenda2)
    // Merge sort manual
    fun merge(lista: MutableList<String>): MutableList<String> {
        if (lista.size <= 1) return lista
        val mid = lista.size / 2
        val izq = merge(lista.subList(0, mid).toMutableList())
        val der = merge(lista.subList(mid, lista.size).toMutableList())
        val result = mutableListOf<String>()
        var i = 0; var j = 0
        while (i < izq.size && j < der.size) {
            if (izq[i] <= der[j]) result.add(izq[i++]) else result.add(der[j++])
        }
        while (i < izq.size) result.add(izq[i++])
        while (j < der.size) result.add(der[j++])
        return result
    }
    val maestra = merge(unidos)
    println("Lista maestra ordenada: $maestra")
}

// Reto 21: Días de Mantenimiento (Primos)
fun reto21DiasPrimos() {
    println("\n Reto 21: Días de Mantenimiento (Primos) ")
    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
    val marca = "Otis"
    val pisosPrimos = Array(0) { 0 }.toMutableList()
    for (piso in 1..100) {
        if (esPrimo(piso)) pisosPrimos.add(piso)
    }
    println("Pisos con mantenimiento especial (marca $marca): $pisosPrimos")
}

// Reto 22: Pila de Platos Sucios
fun reto22PilaPlatos() {
    println("\n Reto 22: Pila de Platos Sucios (LIFO) ")
    val pila = mutableListOf<String>()
    fun push(plato: String) { pila.add(plato); println("  Apilado: $plato → Pila: $pila") }
    fun pop(): String? {
        if (pila.isEmpty()) { println("  ¡Pila vacía!"); return null }
        val plato = pila.removeLast()
        println("  Lavado: $plato → Pila: $pila")
        return plato
    }
    push("Plato-1"); push("Plato-2"); push("Plato-3")
    pop(); push("Plato-4"); pop(); pop()
}