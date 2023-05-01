//programer A cretes the wash machine 关心洗衣机的运作更加符合使用者的需求，考虑各方面的细节
class WashMachineProgramerA(var module:String, var size:Int) {
    var isDoorOpen = true
    var currentMode = 0
    fun openDoor(){
        println("洗衣机门已经打开")
        isDoorOpen = true
    }
    fun closeDoor(){
        println("洗衣机门已经关闭")
        isDoorOpen = false
    }
    fun selectMode(mode:Int){
        when(mode){
            0 -> println("初始模式，请选择模式")
            1 -> println("轻柔模式")
            2 -> println("狂揉模式")
            else -> println("警告你不要乱搞，不然厂家不保修！")
        }
        currentMode = mode
    }
    fun startWash(){
        if(isDoorOpen == true){
            println("门还没关，不能洗！")
        } else {
            when (currentMode){
                0 -> {println("选择模式错误，不能开始")}
                1 -> {
                    println("放水。。。")
                    println("轻柔模式，发动机转速慢")
                    println("洗完啦")
                }
                2 -> {
                    println("放水。。。")
                    println("狂揉模式，发动机转速快")
                    println("洗完啦")
                }
                else -> {
                    println("模式不能被识别")
                }
            }
        }
    }
}