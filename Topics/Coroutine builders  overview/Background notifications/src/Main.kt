fun doAllTheJob() {
    GlobalScope.launch {
        printProgress()
    }
    runBlocking {
        loadData()
    }
}
