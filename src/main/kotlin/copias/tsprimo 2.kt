fun main(args: Array<String>) {
    //continue a solução

    val qtd: Int = readLine()!!.toInt()

    for (i in 1..qtd) {

        val num: Double = readLine()!!.toDouble()

        if (ePrimo(num)) {
            println("Prime")
        } else {
            println("Not Prime")
        }
    }
}

//Função
fun ePrimo(num: Double): Boolean {
    var d = 2.0
    while (d * d <= num) {
        if (num % d == 0.0) {
            return false
        }
        d++
    }
    return true
}

fun primo2(n: Int): Boolean {
    var d: Int
    if (n <= 1) return false
    d = 2
    while (d * d <= n) {
        if (n % d == 0) // d divide n
            return false
        d++
    }
    return true
}


