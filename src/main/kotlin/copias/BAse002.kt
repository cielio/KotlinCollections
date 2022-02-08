package copias

fun main(args: Array<String>) {

    while (true) {
        var s = readLine()!!.toString()
        //aki no seu, tava errado pq ele poderia da mais uma entrada pra converte, assim ele ja para o While...
        if (s == "-1")
            break
        //aki o subString buga, em um dos teste, pq n tem padrao nas entradas...
        if (s.contains("0x")) {
            val s1 = s.removeRange(0, 2)
            println(s1.toInt(16))
        } else {
            println("0x" + Integer.toHexString(s.toInt()).toUpperCase())
        }
    }
}