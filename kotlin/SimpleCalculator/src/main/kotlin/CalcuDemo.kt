fun main() {
    var a = 8
    var b = 2
    println("a + b = ${plus(a,b)}")
    println("a - b = ${sub(a,b)}")
    println("a * b = ${mul(a,b)}")
    println("a / b = ${div(a,b)}")
}

fun plus(a:Int, b:Int): Int{
    return a+b
}
fun sub(a:Int, b:Int): Int{
    return a-b
}
fun mul(a:Int, b:Int): Int{
    return a*b
}
fun div(a:Int, b:Int): Int{
    return a/b
}