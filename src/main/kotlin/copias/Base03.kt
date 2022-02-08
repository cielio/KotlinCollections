package copias

fun main() {

    val r = """0x.*""".toRegex()
    while (true) {
        var s: String = readLine()!!.toString()
        if (s == "-1")
            break

        if (s.matches(r)) {
            val decimalString = s.removeRange(0, 2)
            println(decimalString.toInt(16))
        } else {
            val hexString = Integer.toHexString(s.toInt())
            println("0x${hexString.toUpperCase()}")
        }
    }
}
