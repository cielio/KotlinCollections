fun main() {
    while (true) {
        //val l = readLine()!!.toInt()
        val v = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        v.sort()
        println(v.sorted())
        when (v.sorted().last()) {
            in 1..9 -> println("1")
            in 10..19 -> println("2")
            else -> println("3")
        }
    }
}

val v = readLine()!!.split(" ").run {
    val numbers: ArrayList<Int> = arrayListOf<Int>()
    for (i in this) {
        numbers.add(i.toInt())
    }
    numbers
}
