fun main() {
    var result = 0
    println(ollAdd(10000, result))
}

tailrec fun ollAdd(num:Int, result:Int):Int{
    println("count ${num}, result=${result}")
    if(num==0){
        return 1
    }else{
        return ollAdd(num-1, result+num)
    }
}