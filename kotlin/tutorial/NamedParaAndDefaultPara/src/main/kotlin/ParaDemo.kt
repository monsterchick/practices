val Pi = 3.14159f    // constant/immutable parameter常亮参数

fun getRectArea(width:Float, height:Float):Float{
    return width*height
}

fun getPerimeter(pi:Float = Pi, redius:Float):Float{
    return 2*pi*redius
}

fun getPerimeter2(pi:Float = Pi, diameter:Float):Float{
    return pi * diameter
}

fun getCylinderVolumn(pi:Float = Pi, height:Float, redius:Float): Float{
    return pi * redius*redius * height
}

fun getSphereSurfaceArea(pi:Float = Pi, redius: Float): Float{
    return pi * redius*redius * 4
}

fun main() {
    var area = getRectArea(3.0f,2.0f)   // tell kotlin it is a single-precision floating-point number（单精度浮点小数）
    println("area $area")

    var perimeterArea = getPerimeter(redius = 2.0f)   // ignore pi becaus it is immutable parameter
    println("perimeterArea $perimeterArea")

    var perimeterArea2 = getPerimeter2(diameter = 2.0f)   // ignore pi becaus it is immutable parameter
    println("perimeterArea2 $perimeterArea2")

    var cylinderVolumn = getCylinderVolumn(height = 5.0f, redius = 2.0f)
    println("cylinderVolumn $cylinderVolumn")

    var sphereSurfaceArea = getSphereSurfaceArea(redius = 2.0f)
    println("sphereSurfaceArea $sphereSurfaceArea")
}
// conclusion:
// getPerimeter(redius = 2.0f); redius is named parameter
// val Pi = 3.14159f; Pi is default parameter