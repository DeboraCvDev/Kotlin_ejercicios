fun main(args: Array<String>) {
 println("Programa que calcule el area y perimetro de un circulo ingresando solo el radio")
    println("Ingrese el radio:")
    val radio:Double = readLine()!!.toDouble()
    val areaDelCirculo:Double
    val perimetroCirculo:Double
    areaDelCirculo=calcularAreaDelCirculo(radio = radio)
    perimetroCirculo=calcularPerimetroDelCirculo(radio = radio)
    imprimirElAreaYperimetroDelCirculo(areaDelCirculo,perimetroCirculo)
}