import kotlin.math.*

fun main() {


    val number = readLine()!!.toDouble()

    println(floor((number - floor(number)) * 10))
}
