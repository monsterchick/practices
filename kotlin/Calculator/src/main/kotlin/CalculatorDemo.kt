import java.lang.Exception

fun main() {
    while(true) {
        println("welcome to use Calculator")
        println("please input the first number:")
        var num1str = readLine()
        println("please input the second number:")
        var num2str = readLine()

        try {
            var num1: Int = num1str!!.toInt()    // ensure that the number input is not null 确保输入的数字不为空
            var num2: Int = num2str!!.toInt()
            println("${num1} + ${num2} = ${num1 + num2}")
        } catch (e: Exception) {
            println("come on! number number number!!!!!")
        }
    }
}