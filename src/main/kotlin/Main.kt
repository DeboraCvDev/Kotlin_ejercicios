fun main(args: Array<String>) {
    println("Programa para calcular la suma de dos numeros enteros")
    println("Ingrese primer numero:")
    val primerNumero: Int = readLine()!!.toInt()
    println("Ingrese segundo numero:")
    val segundoNumero: Int = readLine()!!.toInt()

    val suma: Int = calcularSuma(primerNumero = primerNumero, segundoNumero = segundoNumero)
    imprimirlaSumaDePrimerNumeroYsegundoNumero(primerNumero = primerNumero, segundoNumero = segundoNumero, suma = suma)

    //imprimirlaSumaDePrimerNumeroYsegundoNumero(primerNumero = primerNumero, segundoNumero = segundoNumero)
}
