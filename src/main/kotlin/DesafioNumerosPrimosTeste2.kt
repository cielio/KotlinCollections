fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (index in 1..n) {

        val x = readLine()!!.toLong()
        if (isPrime(x)) {
            println("Prime")
        } else {
            println("Not Prime")
        }
    }
}

private fun isPrime(numPrimo: Long): Boolean {
    val sqrRoot: Double = kotlin.math.sqrt(numPrimo.toDouble())
    val n: Int = sqrRoot.toInt()
    for (d in 2..n) {
        if (numPrimo % d == 0L) return false
    }
    return true
}