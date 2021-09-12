package cinema

fun main() {
  //  println("Cinema:")
  //  println("  1 2 3 4 5 6 7 8")
  //  for (i in 1..7) println("$i${" S".repeat(8)}")
  
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatInRow = readLine()!!.toInt()
    
    val seats = rows * seatInRow
    val halfRows = rows / 2
    
    
    if( seats < 60) {
        println("Total income: $" + seats *10)
    } else {
        println("Total income: $" + ((halfRows * seatInRow * 10) + (rows - halfRows) * seatInRow * 8))
    }

 
}