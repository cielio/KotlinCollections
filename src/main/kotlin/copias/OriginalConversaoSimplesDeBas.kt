package copias

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    var result = ""
    val regexHexa = """0x.*""".toRegex()
    while (true) {
        try {
            val saida = readLine()!!

            if (saida == "-1") {
                break
            }

            if (regexHexa.containsMatchIn(saida)) {
                result = converteHexadecimalParaDecimal(saida).toString()
                println(result)
            } else {
                result = toDecimalParaHexadecimal(saida.toInt()).toString()
                println(result)
            }
        } catch (f: ArrayIndexOutOfBoundsException) {
            break
        } catch (n: NumberFormatException) {
            break
        } catch (e: Exception) {
            break
        }
    }
}


fun toDecimalParaHexadecimal(valor: Int): String? {
    var valor = valor
    val hexa = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    var resto = -1
    val sb = StringBuilder()
    when {
        valor != 0 -> {
            // enquanto o resultado da divisão por 16 for maior que 0 adiciona o resto ao início da String de retorno
            while (valor > 0) {
                resto = valor % 16
                valor /= 16
                sb.insert(0, hexa[resto])
            }
            sb.insert(0, "0x")
            return sb.toString()
        }
        else -> return "0"
    }
}

fun converteHexadecimalParaDecimal(valorHexa: String): Int {
    var convert = valorHexa
    val regexHexa = """0x.*""".toRegex()
    if (regexHexa.containsMatchIn(convert)) {
        val match = regexHexa.find(convert)
        convert = match?.value!!.substringAfter("0x")
    }
    var valor = 0
    var posicaoCaractere = -1
    val hexa = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')

    // soma ao valor final o dígito binário da posição * 16 elevado ao contador da posição (começa em 0)
    for (i in convert.length downTo 1) {
        posicaoCaractere = Arrays.binarySearch(hexa, convert[i - 1])
        valor += (posicaoCaractere * 16.0.pow((convert.length - i).toDouble())).toInt()
    }
    return valor
}