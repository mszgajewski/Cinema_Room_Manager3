fun identity(argument: Int): Int = argument
fun half(argument: Int): Int = argument / 2
fun zero(argument: Int): Int = 0

fun generate(functionName: String): (Int) -> Int {
    if (functionName == "identity") {
        return ::identity
    } else if (functionName == "half") {
        return ::half
    } else if (functionName == "zero") {
        return ::zero
    }
    return ::zero
}
