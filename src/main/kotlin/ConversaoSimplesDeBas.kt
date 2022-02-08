import java.lang.Integer.*

fun main(args: Array<String>) {
    val regexHexa = """0x.*""".toRegex()
    while (true) {
        val entradas = readLine()!!.split("\\r?\\n")
        entradas.forEach { entrada ->
            if (entrada == "-1") {
                return
            } else if (entrada?.let { regexHexa.containsMatchIn(it) } == true) {
                println(entrada.substringAfter("0x").toInt(16).toString())
            } else println("0x" + entrada?.toInt()?.let { it.toString(16).toUpperCase() })
        }
    }
}
