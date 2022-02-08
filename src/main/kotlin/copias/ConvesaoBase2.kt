fun main() {

    val r = """0x.*""".toRegex()
    while (true) {
        var entrada: String = readLine()!!.toString()

        if (entrada == "-1") {
            break
        }
        if (r.containsMatchIn(entrada)) {
            println(convertHexaToDec(entrada))
        } else {
            println("0x${convertDecToHex(entrada)}")
        }
    }
}

fun convertHexaToDec(entrada: String): Int {
    var newEntrada = entrada.split("0x")[1]

    var valueHexaDec: Int
    var valorFinalDec: Int = 0
    var sizeEntrada = newEntrada.length - 1

    for (n in newEntrada) {
        valueHexaDec = baseHexaToDec(n)
        val pot = Math.pow(16.0, sizeEntrada.toDouble())
        valorFinalDec += (valueHexaDec * pot).toInt()

        sizeEntrada--
    }
    return valorFinalDec
    //println(valorFinalDec)
}


fun baseHexaToDec(carac: Char): Int {

    when (carac.toUpperCase()) {
        'A' -> return 10
        'B' -> return 11
        'C' -> return 12
        'D' -> return 13
        'E' -> return 14
        'F' -> return 15
        else -> return Integer.parseInt(carac.toString())
    }
}

fun convertDecToHex(value: String): String {

    var valueInt = Integer.parseInt(value)
    var resto: Int
    var result = mutableListOf<Int>()

    var valueHexa: String = ""

    var quociente = valueInt / 16

    while (valueInt / 16 > 0) {
        quociente = valueInt / 16
        resto = valueInt - (quociente * 16)
        val r = valueInt % 16

        //println("${valueInt} - $resto - $quociente")

        valueInt = quociente
        result.add(resto)

    }
    result.add(valueInt)
    result.reversed()

    for (n in result) {
        valueHexa += baseDecToHexa(n)
    }
    return valueHexa.reversed()
}

fun baseDecToHexa(carac: Int): String {

    when (carac) {
        10 -> return "A"
        11 -> return "B"
        12 -> return "C"
        13 -> return "D"
        14 -> return "E"
        15 -> return "F"
        else -> return carac.toString()
    }
}