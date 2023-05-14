fun main() {
    var i = 18  // smart cast: type Int
    println("Value of i is ${i}. Type of i is ${i::class.simpleName}")
//    i = "try to change the type"  // error since the datatype of i is Int

    var s:String = "this is string"  // custom the type
    println("Value of s is ${s}. Type of s is ${s::class.simpleName}")

    val number:String = "No.11123"  // only readable
//    number = 11  // val cannot be reasigned
    println("number: value = ${number}; type = ${number::class.simpleName}")
}