fun diaryGenerator(placeName:String):String{
    var template = """
        today is a good day. How are you ${placeName}. We are good friends forever, ${placeName}
    """.trimIndent()
    return template
}
fun main() {
    var diary = diaryGenerator("Superman")
    println(diary)

    diary = diaryGenerator("Kitty")
    println(diary)

    diary = diaryGenerator("Booob")
    println(diary)
}