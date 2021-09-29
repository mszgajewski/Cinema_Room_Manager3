class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {

    val a = rectangle.width
    val b = rectangle.height

    println(a * b)
}