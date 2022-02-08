fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    var number1: Int
    var number2: Int

    for (i in 1..N) {
        var test = readLine()!!

        var regexUper = "[A-Z]".toRegex()
        var regexNumber = "[0-9]".toRegex()
        val match = regexUper.find(test)
        val matchNumber = regexNumber.findAll(test).toList()
        number1 = matchNumber[1].value.toInt()
        number2 = matchNumber[0].value.toInt()


        when {
            match?.value != null && number1 != number2 -> {
                println(number1 - number2)
            }
            number1 == number2 -> {
                println(number1 * number2)
            }
            else -> {
                println(number1 + number2)
            }
        }

    }
}