fun main() {
	val joao = Funcionario("Joao", 2500.0, "CLT")
	val pedro = Funcionario("Pedro", 1200.0, "PJ")
	val cielio = Funcionario("Cielio", 1000.0, "CLT")

	val  repositorio = Repositorio<Funcionario>()

	repositorio.create(joao.nome, joao)
	repositorio.create(pedro.nome, pedro)
	repositorio.create(cielio.nome, cielio)

	println(repositorio.findById(joao.nome))
}