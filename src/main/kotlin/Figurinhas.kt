fun main() {
    val lista = mutableListOf<Int>()
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        var n1 = input[0]
        var n2 = input[1]
        lista.add(mdc(n1, n2))
    }
    lista.forEach { println(it) }

}

fun mdc(n1: Int, n2: Int): Int {
    return if (n2 <= n1 && n1 % n2 == 0) n2 else if (n1 < n2) mdc(n2, n1) else mdc(n2, n1 % n2)
}