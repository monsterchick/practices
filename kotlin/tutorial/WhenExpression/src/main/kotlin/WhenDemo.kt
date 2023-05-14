fun gradeStudent(score:Int){
    when(score){
        10 -> println("gooooood")
        9 -> println("well done")
        8 -> println("not bad")
        7 -> println("need more effort")
        6 -> println("just pass")
        else -> println("serious?")
    }
}

fun main() {
    val score = 10
    gradeStudent(score)
}