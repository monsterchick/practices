fun sayHello(name:String):String {
    return "hello: $name"
}

fun checkAge(age:Int):Boolean {
    return if (age>=18) true else false
}

fun saveLog(logLevel:Int){

}

// to use the functions, main() is necessary
// entry point of the program
fun main() {
    val sayHello = sayHello("Kelvin")
    println(sayHello)

    val checkAge = checkAge(18)
    println(checkAge)

    println(saveLog(1))
}