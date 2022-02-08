package copias

fun main(args: Array<String>) {
    val patternHexadecimal = """0x.*""".toRegex()
    val listatotal = mutableListOf<String>()

    while (true) {
        val input = readLine()!!
        if (input == "-1")
            break

        if (input.contains(patternHexadecimal)) {
            val remover = input.removeRange(0, 2)
            val result: Int = remover.toInt(16)
            listatotal.add(result.toString())
        } else {
            val hex = Integer.toHexString(input.toInt()).toUpperCase()
            val hexadecimal = "0x$hex"
            listatotal.add(hexadecimal)
        }
    }
    for (i in listatotal) {
        println(i)
    }
}