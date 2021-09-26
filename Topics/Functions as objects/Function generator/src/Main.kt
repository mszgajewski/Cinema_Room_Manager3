fun identity(argument: Int){
    return argument
} 
fun half(argument: Int){
    return argument / 2
}
fun zero(argument: Int){
    return 0

fun generate(functionName: String): (Int) -> Int {
    if (functionName = "indentity") {
        return indentity()
    } else if (functionName = "half") {
        return half()
    } else if (functionName = "zero") {
        return zero()
    } else {
        return 0
    }
}
