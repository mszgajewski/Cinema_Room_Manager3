
fun main() {
    val fileName = "src/new.txt"
    val linesLength = File(fileName).length()
    val lines = File(fileName).readLines().size
    print("$linesLength $lines")
}