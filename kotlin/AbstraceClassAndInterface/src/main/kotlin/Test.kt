/*
*接口Interface：是事物的能力
* 抽象类abstract class：是事物的本质
*/

fun main() {
    val man1 = Man()
//    man1.dick()

    val man2 = TaiJian()
//    man2.eat()

//    var houseList = listOf<IMan>(man1,man2) //man2是太监，没有小弟弟接口所以报错
    val houseList = listOf<Human>(man1,man2)
    for (p in houseList){
        if (p is Man){
            p.dick()
        } else {
            p.eat()
        }
    }
}