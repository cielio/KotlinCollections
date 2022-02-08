package copias

import kotlin.math.sqrt

fun primos(numero: Double): Boolean {
    var j = 2
    var calculo: Int = (sqrt(numero)).toInt()
    for (j in 2..calculo) {
        if (numero % j == 0.0) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    var x: Double
    var check: Boolean
    for (i in 1..n) {
        x = readLine()!!.toDouble()
        check = primos(x)
        if (check) {
            println("Prime")
        } else {
            println("Not Prime")
        }
    }
}

