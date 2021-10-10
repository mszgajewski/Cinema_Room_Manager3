import kotlin.math.absoluteValue

object Math {
    fun abs(integer: Int = readLine()!!.toInt()): Int {
        return integer.absoluteValue
    }
    fun abs(double: Double = readLine()!!.toDouble()): Double {
        return double.absoluteValue
    }
}
