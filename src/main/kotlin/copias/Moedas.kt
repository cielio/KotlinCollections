package copias

fun main(args: Array<String>) {

    var total = readLine()!!.toInt()
    println(total)
    val notasDe100 = total / 100
    total %= 100
    val notasDe50 = total / 50
    total %= 50
    val notasDe20 = total / 20
    total %= 20
    val notasDe10 = total / 10
    total %= 10
    val notasDe5 = total / 5
    total %= 5
    val notasDe2 = total / 2
    total %= 2
    val notasDe1 = total / 1

    println("$notasDe100 nota(s) de R\$ 100,00")
    println("$notasDe50 nota(s) de R\$ 50,00")
    println("$notasDe20 nota(s) de R\$ 20,00")
    println("$notasDe10 nota(s) de R\$ 10,00")
    println("$notasDe5 nota(s) de R\$ 5,00")
    println("$notasDe2 nota(s) de R\$ 2,00")
    println("$notasDe1 nota(s) de R\$ 1,00")
}