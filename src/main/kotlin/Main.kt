fun main(args: Array<String>) {
    println("Calcular las suma de 2 numeros:")

    println("INGRESE PRIMER NUMERO:")
    val  primerNumero:Int= readLine()!!.toInt()

    println("INFRESE SEGUNDO NUMERO:")
    val segundoNumero:Int= readLine()!!.toInt()
    val suma:Int
    suma = calcularSumaDeDosNumeros(primerNumero = primerNumero, segundoNumero = segundoNumero)
    imprimirSumaDeDosNumeros(primerNumero = primerNumero,segundoNumero=segundoNumero, suma = suma)
}