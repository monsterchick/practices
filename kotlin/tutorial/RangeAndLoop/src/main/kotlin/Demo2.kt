fun main() {
    var nums = 1 until 100  // print 1 - 99
    for(num in nums){
        println(num)
    }

    println("")
    var nums2 = 1..16
    for(a in nums2 step 2){
        println(a)
    }

    println("")
    var nums3 = nums2.reversed()
    for (a in nums3){
        println(a)
    }
}