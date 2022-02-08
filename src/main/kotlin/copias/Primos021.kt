package copias

import kotlin.math.sqrt

fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    var rq = 0L
    var contador = 0

    for (i in 1..n) {
        val num = readLine()!!.toLong()

        rq = sqrt(num.toDouble()).toLong()
        for (j in 2..rq) {
            val a = (num % j)

            if (a == 0L)
                contador++
        }
        if (contador == 0) {
            println("Prime")
        } else {
            println("Not Prime")
        }

    }

    fun verificadorPrimo(n: Double) {
        var primo = 1;
        for (aux in 2..sqrt(n).toInt())
            if ((n % aux) == 0.0)
                primo = 0;
        if (primo == 1 || n == 1.0)
            println("Prime");
        else
            println("Not Prime");
    }

}