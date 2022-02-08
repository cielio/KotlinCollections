import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {
    val teste = 1.3 / 100
    val resultado = BigDecimal(teste).setScale(3, RoundingMode.HALF_EVEN)
    println(teste)
    println(resultado)
    println(String.format("%.3f", resultado))
    println(String.format("%.3f", resultado).replace(',', '.'))
}