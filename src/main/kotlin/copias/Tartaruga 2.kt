package copias


fun main(args: Array<String>) {
    while (true) {
        try {
            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map { it.toInt() }.toMutableList() }
            v.sort()
            val result = when (v.last()) {
                in 0..9 -> 1
                in 10..19 -> 2
                else -> 3
            }
            println(result)
        } catch (f: Exception) {
            break
        }
    }
}