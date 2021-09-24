import kotlin.math.*

fun main() {
    val population: Double = readLine()!!.toDouble()

    println(population.pow(1.0/3.0).roundToInt())

}