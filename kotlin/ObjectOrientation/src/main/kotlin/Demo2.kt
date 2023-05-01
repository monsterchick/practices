//妹子 长相 声音

//静态：属性 例如charactor, voice
//动态：行为 例如smile, cry
class Girl(var charactor:String, var voice:String){
    //行为
    fun smile(){
        println("妹子笑了一下，好甜呀！")
    }
    fun cry(){
        println("呜呜呜，人家好伤心呀！")
    }
}

fun main() {
    val girl = Girl("彪悍", "甜美")
    println("妹子的性格：${girl.charactor} 妹子的声音：${girl.voice}")

    println("当我摸了一下妹子的头发时：")
    girl.smile()
    println("当我暴打了妹子时：")
    girl.cry()
}