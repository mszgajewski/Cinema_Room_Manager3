fun solution(first: Set<String>, second: MutableList<String>) : Boolean {
    if(first.containsAll(second) && second.containsAll(first)) {
        return true
    }
    return false
}