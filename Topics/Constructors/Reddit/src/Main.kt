fun main(){


    class Site(var address: String, var foundationYear: Int)

    fun makeReddit():Site {
    return Site(address = "reddit.com", foundationYear = 2005)

}

    val reddit: Site = makeReddit()
    println(reddit)
}

