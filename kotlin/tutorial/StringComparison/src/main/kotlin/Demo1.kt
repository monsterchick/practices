fun main() {
    var str1 = "zhang san"
    var str2 = "ZHANG SAN"
    println(str1 == str2)
    println(str1.equals(str2))

    println(str1.equals(str2, true))    // ignore case
}