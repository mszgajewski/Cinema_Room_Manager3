import kotlin.math.*

fun main() {
    val a: Double = readLine()!!.toDouble()
    val b: Double = readLine()!!.toDouble()
    val c: Double = readLine()!!.toDouble()
    
    val p = (a + b + c) / 2
    val res = (p * (p - a) * (p - b) * (p - c))


    println(Math.sqrt(res))
}
