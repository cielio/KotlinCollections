fun main() {

    val salarios = doubleArrayOf(1500.00, 2250.00, 5000.14, 3500.00)
    salarios.sort()

    salarios.forEach { salario -> println(String.format("%.2f", salario)) }

    println("----------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    println("----------------------------")

    val salariosMaioresQue2000 = salarios.filter { salario -> salario >= 2000 }
    salariosMaioresQue2000.forEach { salario -> println(String.format("%.2f", salario)) }

    println("----------------------------")
    println(salarios.count { salario -> salario in 2000.00..5000.00 })

    println("----------------------------")

    //println(salarios.find { it == 5000.14 })
    println(salarios.find { salario -> salario == 5000.14 })
    //se nao encontrar retona null
    println(salarios.find { salario -> salario == 0.0 })

    println("----------------------------")
    //retona true se encontrar algum elemento... se nao false
    println(salarios.any { salario -> salario == 5000.14 })
    println(salarios.any { it == 0.0 })


}