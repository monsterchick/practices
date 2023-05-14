//小母驴，小公驴，小公马生下的儿子
// sealed更在意类型
sealed class Son {
    fun sayHello(){
        println("大家好")
    }

    class 小驴子():Son()
    class 小骡子():Son()

}