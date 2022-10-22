fun main(args: Array<String>) {
println("Programa que calcule el cuadrado de un numero")
    println("Ingrese un numero ")
    val numero:Int= readLine()!!.toInt()
    val cuadrado:Int=calcularElCuadradoDeUnNumero(numero=numero)
    imprimirelCuadradoDeUnNumero(numero=numero,cuadrado=cuadrado)
}