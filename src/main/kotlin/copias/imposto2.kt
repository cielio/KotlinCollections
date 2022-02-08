package copias

fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')
    val valor = readLine()!!.toFloat();

    var aux1: Float;
    var aux2: Float;
    var aux3: Float;
    var resultado: Float;

    if ((valor > 2000.01) && (valor <= 3000.00)) {
        aux1 = ((valor - 2000.00) * 0.08)!!.toFloat()
        println("R$ ${aux1.format(2)}")
    } else if ((valor >= 3000.01) && (valor <= 4500.00)) {
        aux1 = (valor - 3000.00)!!.toFloat()
        aux2 = ((valor - 2000.00) - aux1)!!.toFloat()
        resultado = ((aux1 * 0.18) + (aux2 * 0.08))!!.toFloat()
        println("R$ ${resultado.format(2)}")

    } else if (valor > 4500.00) {
        aux1 = (valor - 4500.00)!!.toFloat()
        aux2 = ((valor - 3000.00) - (aux1))!!.toFloat()
        aux3 = ((valor - 2000.00) - (aux1 + aux2))!!.toFloat()
        resultado = ((aux1 * 0.28) + (aux2 * 0.18) + (aux3 * 0.08))!!.toFloat()
        println("R$ ${resultado.format(2)}")
    } else if ((valor >= 0.0) && (valor <= 2000.0))
        println("Isento")
    else
        println("R$ ${valor.format(2)}")
}
