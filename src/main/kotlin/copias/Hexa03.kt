package copias

fun main(args: Array<String>) {
    val patternHexadecimal = """0[a-zA-Z].""".toRegex()
    val patternHex = """[a-zA-Z].""".toRegex()
    val ltotal = mutableListOf<String>()
    var valor = true
    while (true) {
        val leitura =
            readLine()!!.toString()
        if (leitura == "-1") {
            break
        }
        if (!leitura.contains(patternHexadecimal) && leitura.toInt() > 0 && leitura.toInt() < Integer.MAX_VALUE) {
            val n = leitura.toInt()
            val decimal = Integer.toHexString(n).toUpperCase()
            val decimalCompleto = "0x$decimal"
            ltotal.add(decimalCompleto)
        }

        if (leitura.contains(patternHexadecimal) && leitura.contains(patternHex)) {
            val remover = leitura.removeRange(0, 2)
            val resultado: Int = remover.toInt(16)
            ltotal.add(resultado.toString())
        }
    }
    for (i in ltotal) {
        println(i)
    }
}