
//父类
open class Father {
    var charactor:String = "性格内向"   //open关键字指该类允许被继承
    open fun action(){  //加open允许action方法被重写override
        println("公共场合大声说话")
    }
}