fun add(x:Int, y:Int):Int {
    return x+y
}

//fun add(x:Int, y:Int):Int = x+y     // simplify code

fun main() {
    var x:Int = 3
    var y:Int = 5
    var result = add(x,y)
    println(result)

    var f = {x:Int, y:Int -> x+y}   // this is a function
    var result2 = f(x,y)
    println(result2)

    var f2:(Int,Int)->Int = {x,y -> x+y}
    var result3 = f2(x,y)
    println(result3)
}