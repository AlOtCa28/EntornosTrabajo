fun main(){
    var n1 = 0
    var n2 = 0
    n1 = readln().toInt()
    n2 = readln().toInt()

    println(suma(n1,n2))
    println(resta(n1,n2))
    println(multiplicacion(n1,n2))
    println(division(n1,n2))
}
fun suma(n1:Int,n2:Int):Int{
    var resultado = 0
    resultado = n1 + n2
    return resultado
}

fun resta(n1:Int,n2:Int):Int{
    var resultado = 0
    resultado = n1 - n2
    return resultado
}

fun multiplicacion(n1:Int,n2:Int):Int{
    var resultado = 0
    resultado = n1 * n2
    return resultado
}

fun division(n1:Int,n2:Int):Int{
    var resultado = 0
    resultado = n1 / n2
    return resultado
}
fun resta2(n1:Int,n2:Int):Int{
    var resultado = 0
    resultado = n1 - n2
    return resultado
}

