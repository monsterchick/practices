class Woman(name:String):Human(name) {
    override fun eat(){
        println("${name}小口小口地咀嚼")
    }

    override fun pee() {
        println("${name}坐着尿尿")
    }
}