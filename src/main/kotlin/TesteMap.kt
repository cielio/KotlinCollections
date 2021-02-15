fun main() {
	val pair: Pair<String, Double> = Pair("Joao", 100.0)
	val map1 = mapOf(pair)

	map1.forEach { (t, u) -> println("Chave: $t - Valor: $u") }


	val  map2 = mapOf(
			"Pedro" to 200.0,
			"Cielio" to 2030.0
	)

	map2.forEach { (t, u) -> println("Chave: $t - Valor: $u") }

}