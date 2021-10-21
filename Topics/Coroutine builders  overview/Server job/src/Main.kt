fun doAllTheJob() {
    val importantJob = GlobalScope.launch {
        connectToServer()
    }
    val notImportantJob = GlobalScope.launch {
        loadData()
    }
    runBlocking {
        importantJob.join()
    }
    notImportantJob.cancel()
}