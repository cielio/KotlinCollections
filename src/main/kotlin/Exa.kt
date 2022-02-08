fun main() {
    var stop = 0
    while (stop >= 0) {
        val saida = readLine()
        if (saida == "-1") {
            stop = -1
        } else if (saida?.substring(1, 2) == "x") {
            println(saida.substring(2).toInt(16))
        } else {
            println("0x" + saida?.toInt()?.toString(16)?.toUpperCase())
        }
    }
}