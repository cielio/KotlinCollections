fun main() {
	val joao = Funcionario("Joao", 2500.0, "CLT")
	val pedro = Funcionario("Pedro", 1200.0, "PJ")
	val cielio = Funcionario("Cielio", 1000.0, "CLT")

	val funcionarios = setOf(joao, pedro)
	val funcionarios2 = setOf(cielio)

	val resultUnion = funcionarios.union(funcionarios2)
	resultUnion.forEach{println(it)}

	println("----------------------")
	val  funcionario3 = setOf(joao, pedro, cielio)
	val  resultSubtract = funcionario3.subtract(funcionarios2)
	resultSubtract.forEach{println(it)}

	println("----------------------")
	val  resultIntersect = funcionario3.intersect(funcionarios2)
	resultIntersect.forEach{println(it)}

}