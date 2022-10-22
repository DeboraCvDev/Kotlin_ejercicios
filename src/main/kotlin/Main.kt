fun main(args: Array<String>) {
    println("Programa para calcular el cociente y el residuo de dos numeros")

    println("Ingrese el divisor")
    val primerNumero: Int = readLine()!!.toInt()

    println("Ingrese dividendo")
    val segundoNumero: Int = readLine()!!.toInt()

    val cociente: Int = calcularElCociente(primerNumero = primerNumero, segundoNumero = segundoNumero)
    val residuo: Int = calcularElResiduo(primerNumero=segundoNumero,segundoNumero= segundoNumero)
    imprimirResultado(cociente=cociente,residuo=residuo)

}
