fun main() {

    val r = """0x.*""".toRegex()

    while (true) {
        val entrada: String = readLine()!!

        if (entrada == "-1") {
            break
        }
        if (r.containsMatchIn(entrada)) {
            convertToDecimal(entrada.substringAfter("0x"))
        } else {
            val numberInt = entrada.toInt()
            println("0x" + entrada?.toInt()?.let { it.toString(16).toUpperCase() })
        }
    }
}

fun convertToDecimal(entrada: String) {
    var number: Int = 0

    var length = entrada.length - 1
    for (n in entrada) {

        val numberToInt = convertDec(n)
        val pot = Math.pow(16.0, length.toDouble()).toInt()
        number += pot * numberToInt
        length--
    }
    println(number.toString())
}

fun convertDecimalToHex(number: Int) {
    var resto: Int
    var coeficiente: Int
    var newNumber: Int = number
    val arrayResult = arrayListOf<Int>()

    if (number <= 9) {
        println("0x$number")
    } else {

        while (newNumber > 10) {
            coeficiente = newNumber / 16
            resto = newNumber - coeficiente * 16
            newNumber = coeficiente
            arrayResult.add(resto)
        }
        arrayResult.add(newNumber)

        convertHexa(arrayResult)
    }
}

fun convertHexa(arrayNumber: List<Int>) {
    var value: String? = ""

    for (n in arrayNumber.asReversed()) {
        if (n <= 9) {
            value += n.toString()
        } else {
            when (n) {
                10 -> value += "A"
                11 -> value += "B"
                12 -> value += "C"
                13 -> value += "D"
                14 -> value += "E"
                15 -> value += "F"
                16 -> value += "10"
                32 -> value += "20"
                64 -> value += "40"
                128 -> value += "80"
                256 -> value += "100"
            }
        }
    }
    println("0x${value?.toUpperCase()}")
}

fun convertDec(n: Char): Int {
    when (n) {
        'a' -> return 10
        'b' -> return 11
        'c' -> return 12
        'd' -> return 13
        'e' -> return 14
        'f' -> return 15
        else -> return Integer.parseInt(n.toString())
    }
}