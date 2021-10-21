suspend fun sendData() {
    delay(1)
    println("Success!")
}

fun delay(i: Int) {

}

// fix me, I want to call suspending function
suspend fun main() {
    // Call suspending function from the article with following signature:
    // suspend fun sendData()
    sendData()
}