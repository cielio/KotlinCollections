fun main() {

	val joao = Funcionario("Joao", 2500.0, "CLT")
	val pedro = Funcionario("Pedro", 1200.0, "PJ")
	val cielio = Funcionario("Cielio", 1000.0, "CLT")

	val funcionarios = listOf(joao, pedro, cielio)

	funcionarios.forEach { println(it) }

	println("---------------------")

	println(funcionarios.find { it.nome == "Cielio" })

	println("---------------------")
	funcionarios
			.sortedBy { it.salario }
			.forEach { println(it) }

	println("---------------------")
	funcionarios
			.groupBy { it.tipoContratacao }
			.forEach {
				println(it)
				println()
			}
}

data class Funcionario(
		val nome: String,
		val salario: Double,
		val tipoContratacao: String
) {
	override fun toString(): String =
			"""
				nome: $nome
				salario: $salario
			""".trimIndent()
}