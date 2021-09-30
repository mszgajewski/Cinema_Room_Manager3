fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val finalList = numbers.toMutableList()
    finalList.add(number)
    return finalList
}
