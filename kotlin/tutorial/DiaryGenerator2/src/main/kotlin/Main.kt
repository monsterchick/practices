fun diaryGenerator(placeName:String){
    var diary = """
        today is a good day. How are you ${placeName}. We are good friends forever, 
        ${placeName}. Oh, your name has ${numToWord(placeName.length)} words!!!
    """.trimIndent()
    println(diary)
}

fun numToWord(num:Int):String{
    var result = when(num){
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "too many"
    }
    return result
}
fun main() {
    diaryGenerator("fxcku")
    diaryGenerator("fxckuuuu")
}