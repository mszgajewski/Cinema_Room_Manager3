import kotlin.math.*

fun main() {
    val rad: Double = readLine()!!.toDouble()
    val sin = sin(rad) // 1.0
    val cos = cos(rad)
    println(sin - cos)
}
