fun main() {
	//continue a solução
	fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
	val r = readLine()!!.toFloat()
	var i = 0F

	if (r in 0.00F..2000.00F) {
		i = 0F
	} else if (r in 2000.01F..3000.00F) {
		i = ((r - 2000.00F) * 0.08F)
	} else if (r in 3000.01F..4500.00F) {
		i = (1000.00F * 0.08F) + ((r - 3000.00F) * 0.18F)
	} else if (r > 4500F) {
		i = (1000.00F * 0.08F) + (1500.00F * 0.18F) + ((r - 4500.00F) * 0.28F)
	}
	if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")


}