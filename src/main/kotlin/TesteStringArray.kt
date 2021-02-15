fun main() {
    val names = Array(4){""}
    names[0] = "Cielio"
    names[1] = "Maria"
    names[2] = "Eliane"
    names[3] = "Marta"

    for (nome in names){ println(nome)}

    println()

    names.sortDescending()
    names.forEach { println(it) }

    val names2 = arrayOf("Cielio", "Eliane", "Rafael")

    println()

    names2.sortDescending()
    names2.forEach { println(it) }
}