
val PI:Double = 3.1415

fun calcularAreaDelCirculo(radio:Double):Double{
    return PI*(radio*radio)
}
fun calcularPerimetroDelCirculo(radio: Double):Double{
    return 2*PI*radio
}
fun imprimirElAreaYperimetroDelCirculo(area:Double,perimetro:Double) {
    println("el area es->$area")
    println("el perimetro es->$perimetro")
}


