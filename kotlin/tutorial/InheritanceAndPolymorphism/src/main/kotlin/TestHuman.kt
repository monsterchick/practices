fun main() {
    var person1 = Man("傻逼1号")
    person1.eat()

    var person2 = Woman("仙女1号")
    person2.eat()
    person1.pee()
    person2.pee()

    println("\n以下是多态")
    var person3 = Woman("小美")
    var person4 = Man("小强")
    var person5 = Man("华仔")
    var person6 = Woman("小萝莉")

    var houseList = listOf<Human>(person3,person4,person5,person6)
    for(h in houseList){
        h.pee()
        h.eat()
    }
}