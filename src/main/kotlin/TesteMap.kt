fun main() {
    val pair: Pair<String, Funcionario> = Pair("Joao", Funcionario("Joao", 100.11, "Clt"))
    val map1 = mapOf(pair)

    var listaFuncionarios = mutableListOf<Funcionario>()
    map1.forEach { (a, funcionario) -> listaFuncionarios.add(funcionario) }

    listaFuncionarios.forEach { println(it) }
    val regexHexa = """0x.*""".toRegex()
    var saida = ""
    var teste = regexHexa.containsMatchIn(saida)
}