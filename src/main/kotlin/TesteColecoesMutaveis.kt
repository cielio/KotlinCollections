fun main() {
    val joao = Funcionario("Joao", 2500.0, "CLT")
    val pedro = Funcionario("Pedro", 1200.0, "PJ")
    val cielio = Funcionario("Cielio", 1000.0, "CLT")
    val cielio2 = Funcionario("Cielio", 1000.0, "CLT")


    println("----------List------------")

    val funcionarios = mutableListOf(joao, pedro)
    funcionarios.forEach {
        println(it)
    }

    println("-----------Add-----------")
    funcionarios.add(cielio)
    funcionarios.forEach { println(it) }

    println("-----------Remove-----------")
    funcionarios.remove(cielio)
    funcionarios.forEach { println(it) }


    println("-----------Set Nao aceita itens repedido, mesmo sendo instancias diferentes-----------")

    val funcionariosSet = mutableSetOf(joao)

    funcionariosSet.add(cielio)
    funcionariosSet.add(cielio2)
    funcionariosSet.add(pedro)
    //Set n salva o sortedBy tem q salvar retono no momento da condiçao
    funcionariosSet.sortedBy { funcionario ->
        funcionario.salario >= 1200.00
    }.forEach { println(it) }
    //funcionariosSet.forEach{println(it)}

    println(funcionariosSet.count())

    println("-----------Remove-----------")
    funcionariosSet.remove(cielio)
    funcionariosSet.forEach { println(it) }
}

