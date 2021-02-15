import java.util.*

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 2400.00
    salarios[2] = 1400.00

    salarios.forEach { println(it) }

    println("---------------------")

    salarios.forEachIndexed() { index, salary ->
        salarios[index] = salary * 1.1
    }
    salarios.forEach { println(String.format(locale = null, "%.2f", it)) }

    println("---------------------")

    val salarios2 = doubleArrayOf(1500.00, 1250.00, 5000.14)
    salarios2.forEach { println(String.format("%.2f", it)) }

}