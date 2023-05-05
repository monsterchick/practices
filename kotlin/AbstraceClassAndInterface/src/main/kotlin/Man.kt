//抽象类 类型后面带着个（） 例如Human()
//接口则不用
class Man:Human(), IMan {
    override fun dick(){
        println("18cm是我的小弟弟的长度")
    }

    override fun eat() {
        println("吃吃吃")
    }

}