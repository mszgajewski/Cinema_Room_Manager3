fun f(n: Int) {
    if (n > 0) g(n - 1)
}

fun g(n: Int) {
    print("*")
    if (n > 1) f(n - 3)
}
fun main() {
    g(f10))
}