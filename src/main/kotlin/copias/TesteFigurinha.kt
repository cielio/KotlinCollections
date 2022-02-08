package copias

fun main(args: Array<String>) {

    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input: List<Int> = readLine()!!.split("").map { it.toInt() }
        val x = mdc(input[0], input[1])
        lista.add(x)
    }
    for (i in lista) {
        println(i)
    }
}

// máximo divisor comum (chamada recursiva)
fun mdc(f1: Int, f2: Int): Int {

    var rest: Int
    var f1 = f1
    var f2 = f2

    do {
        rest = f1 % f2
        f1 = f2
        f2 = rest

    } while (rest != 0)

    return f1
}