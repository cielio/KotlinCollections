fun main() {
	//continue a solução
	var n = 0
	var resp = ""
	var primeTemp = 2
	//val entrada: String? = readLine()



	for (i in 2..1000) {

		//n = readLine()!!.toInt()
		n = i
		val isMultiplo = n % primeTemp == 0 && n != primeTemp

		if (isMultiplo) {
			resp = "Not Prime"
		} else {
			primeTemp = i
			resp = "Prime + $i"
		}
		println(resp)
	}
}