fun main(args: Array<String>) {
    var lists = listOf("buy an egg","buy rice","buy ice cream")
    for (list in lists){
        println(list)
    }
    println("")

    for((i,e) in lists.withIndex()){
        println("index: $i item: $e")
    }
}