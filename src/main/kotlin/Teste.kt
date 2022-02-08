fun main() {
    val salarios = DoubleArray(size = 5)

    salarios[0] = 1000.00
    salarios[1] = 1000.00
    salarios[2] = 3000.0
    salarios[3] = 2000.0
    salarios[4] = 1000.0

    salarios.forEach { println(it) }

    println("--------------//--------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

}