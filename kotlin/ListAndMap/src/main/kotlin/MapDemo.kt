import java.util.TreeMap

fun main() {
    var map = TreeMap<String,String>()  // just like dict in python
    map["key1"] = "value1"
    map["key50"] = "value50"
    map["好"] = "Good"
    map["xm"] = "小明"
    println(map)
    println(map["xm"])
    println(map["好"])
    println(map["key50"])
    println(map.get("key1"))
    println("type: ${map.keys::class.simpleName} ${map.keys} type: ${map.values::class.simpleName} ${map.values}")
    println(map.size)
}