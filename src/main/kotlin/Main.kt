fun main(args: Array<String>) {
    println("Programa para calcular el área y perímetro de un pentágono")
    println("Ingrese el lado")
    val lado: Int = readLine()!!.toInt()
    println("Ingrese la apotema")
    val apotema: Int = readLine()!!.toInt()
    val area: Int = calcularArea(apotema = apotema, lado = lado)
    val perimetro: Int = calcularPerimetro(lado = lado)
    imprimirPerimetroYarea(area = area, perimetro = perimetro)


}