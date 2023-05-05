//小头爸爸
class SmallHeadFather : IWashBowl by BigHeadSon{  //代理大头儿子去做
//    override fun washing() {
//        println("我是小头爸爸，真开心，洗一次碗有10块")
//    }
    override fun washing() {
        println("我是大头爸爸")
        BigHeadSon.washing()  //又创建了一个大头儿子
        println("我看着儿子把碗洗完了")
    }
}