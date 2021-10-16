import java.io.File


fun main() {
    val fileName = "MyFile.txt"
    val myFile = File(fileName)
    var content = readLine()!!
    content = content.filter { it != '*' }
    myFile.writeText(content)

}