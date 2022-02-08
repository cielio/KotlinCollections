package copias

fun main() {

    val n = readLine()!!.toInt()
    for (i in 1..n) {
        var sequencia = readLine()!!

        var n1 = sequencia.substring(0, 1).toInt()
        var n2 = sequencia.substring(2, 3).toInt()
        when {
            n1 == n2 -> println(n1 * n2)
            sequencia[1].isUpperCase() -> println(n2 - n1)
            else -> println(n1 + n2)
        }
    }
}

