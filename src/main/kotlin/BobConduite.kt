fun main(args: Array<String>) {

    var totalTeste = readLine()!!.toInt()
    for (i in 1..totalTeste) {
        val input = readLine()!!.split(" ")
        var r1 = input[0].toInt()
        var r2 = input[1].toInt()
        println(r1 + r2)
    }
}