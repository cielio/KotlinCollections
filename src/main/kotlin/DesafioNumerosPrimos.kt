import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toDouble()
    for (i in 1..n.toInt()) {
        val v = readLine()!!.toDouble()
        verificadorPrimo(v)
    }
}

fun verificadorPrimo(n: Double) {
    var primo = 1;
    for (aux in 2..sqrt(n).toInt())
        if ((n % aux) == 0.0)
            primo = 0;
    if (primo == 1 || n == 1.0)
        println("Prime");
    else
        println("Not Prime");
}
