//创建一种新的数据类型，例如人名币货币创建一个3块钱面值的货币
//矩形 长 宽
class Rect(var height:Int, var width:Int)

fun main() {
    var rect1 = Rect(20,10)
    println("hieight: ${rect1.height}")
    println("width: ${rect1.width}")
}