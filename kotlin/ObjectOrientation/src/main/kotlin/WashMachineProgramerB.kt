//programer b 只关心怎么用洗衣机
fun main() {
    val washMachine = WashMachineProgramerA("小天鹅",12)
    println("type of washMachine: ${washMachine::class.simpleName}")

    //开门
    washMachine.openDoor()
    //把衣物
    println("把内内放进去。。。")
    //关门
    washMachine.closeDoor()
    //选择模式
    washMachine.selectMode(1)
    //开始洗衣服程序
    washMachine.startWash()
}