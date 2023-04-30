import java.math.BigInteger

// 5! = 5 × 4 × 3 × 2 × 1 = 120 factorial阶乘
fun main(args: Array<String>) {
    var num = BigInteger("1000")
    println(fact(num))
}

fun fact(num:BigInteger):BigInteger{
    if(num==BigInteger.ONE){
        return BigInteger.ONE
    }else{
        return num * fact(num-BigInteger.ONE)
    }
}