fun main() {
    var result = 0
    var nums = 1 .. 1000
    println("type of nums: ${nums::class.simpleName}")

    for(num in nums){
//        println("$num")
        result += num
    }
    println("result: ${result}")
}