fun main(args: Array<String>) {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 4
    values[2] = 5
    values[3] = 3
    values[4] = 2

    for (valor in values)
    {
        println(valor)
    }

    println("#______________________________#")

    values.forEach { valor ->
        println(valor)
    }

    println("#______________________________#")
    values.sort()
    for (index in values.indices){
        println(values[index])
    }
}