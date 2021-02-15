

fun main() {
    val values = intArrayOf(2,3,5,12,53,6)
    values.forEach {
        println(it)
    }
    println("---------------------")
    values.sortDescending()

    values.forEach { println(it) }
}