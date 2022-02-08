fun main(args: Array<String>) {
    for (i in 1..readLine()!!.toInt()) {
        var input = readLine()!!
        val foundNumberResults = Regex("""\d+""").findAll(input).toList()
        val number1 = foundNumberResults[1].value.toInt()
        val number2 = foundNumberResults[0].value.toInt()
        when {
            number1 == number2 -> println(number1 * number2)
            Regex("[A-Z]").containsMatchIn(input) -> println(number1 - number2)
            else -> println(number1 + number2)
        }
    }
}

/*var input = readLine()!!

//Pega todos os numeros entre as letras e converte pra lista...
val foundNumberResults = Regex("""\d+""").findAll(input).toList()

//pega primeiro numero da lista
val number1 = foundNumberResults[0].value.toInt()
// regex; verifica se tem letras maiusculas de A a Z, e retonar Boolean
Regex("[A-Z]").containsMatchIn(input)

var sequencia = readLine()!!

//pega a primeira letra da string (no caso do teste, o numero..)
var n1 = sequencia.substring(0, 1).toInt()
//pega a letra na string.. e retonar um char.. e pode usar isUpperCase pra verificar se é maiuscula.
sequencia[1].isUpperCase()*/