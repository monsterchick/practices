fun returnBig(a:Int,b:Int):Int{
    return if(a>b) a else b
}

fun main() {
    val a = 3
    val b = -1
    println("which one is bigger between $a and $b: ${returnBig(a,b)}")

}