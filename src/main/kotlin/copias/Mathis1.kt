package copias

fun main() {
    val lista = mutableListOf<Int>()

    for (numbers in 0..100 step 7) {
        lista.add(numbers)
    }
    lista.forEach { println(it) }
}