fun main() {
    var s1:Son = Son.小骡子()
    s1.sayHello()

    var s2:Son = Son.小驴子()
    s2.sayHello()

    var s3:Son = Son.小驴子()

    var list = listOf<Son>(s1,s2,s3)
    for(v in list){
        if(v is Son.小骡子){
            v.sayHello()
        }

    }
}