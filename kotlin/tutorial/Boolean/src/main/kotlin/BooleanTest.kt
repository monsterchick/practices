fun main() {
    var num1 = 4
    var num2 = 6
    println("num1<num2:${num1<num2}")
    println("num1>num2:${num1>num2}")
    println("num1=num2:${num1==num2}")

    println("")
    // check which is greater between √5-√4 and √4-√3
    var num3 = Math.sqrt(5.0) - Math.sqrt(4.0)
    var num4 = Math.sqrt(4.0) - Math.sqrt(3.0)
    println("num3<num4:${num3<num4}")
    println("num3>num4:${num3>num4}")
    println("num3=num4:${num3==num4}")

    println("")
    // check which is greater between 2^100 and 3^75
    var num5 = Math.pow(2.0, 100.0)
    var num6 = Math.pow(3.0, 75.0)
    println("num5<num6:${num5<num6}")
    println("num5>num6:${num5>num6}")
    println("num5=num6:${num5==num6}")
}