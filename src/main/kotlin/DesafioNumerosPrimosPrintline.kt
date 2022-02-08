fun main() {
	//continue a solução
	var i = 103

 	if (primo(i))
 		println("Primo")


}

fun primo(n: Int): Boolean {
	if (n <= 1) return false
	var d= 2
	while (d * d <= n) {
		if (n % d == 0) // d divide n
			return false
		d++
	}
	return true
}
//https://www.dcc.fc.up.pt/~pbv/aulas/progimp/teoricas/teorica07.html