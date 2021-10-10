class Block(val color: String) {

object BlockProperties {
    var length: Int = 4
    var width: Int = 6

    fun blocksInBox(boxLenght: Int = readLine()!!.toInt(), boxWidth: Int = readLine()!!.toInt()): Int {

        return (boxLenght/length) * (boxWidth/width)

    }
}
}