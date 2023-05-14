fun main(args: Array<String>) {
    var a = "十三"
    var b = 13

    a = b.toString()
    println("Int to String $a")

    b = a.toInt()
    println("String to Int $b")

//    var c = "a3"
//    b = c.toInt()   // failed since "a3" include "a"
}