package copias

fun shippingCost(amount: Double, international: Boolean): Double {
    return when {
        international -> if (amount * 0.15 < 50) amount * 0.15 else 50.0
        
        else -> if (amount > 75) 0.0 else amount * 0.1
    }
}

fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()
    println(shippingCost(total, international))
}