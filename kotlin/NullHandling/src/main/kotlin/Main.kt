// receive a non-null value
// add ? means that parameter is nullable
fun heat(str:String?): String{
    return "hot" + str
}

fun main() {
    var result1 = heat("oil")
    println(result1)

    var result2 = heat(null)
    println(result2)
}