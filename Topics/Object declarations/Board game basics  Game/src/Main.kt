object PlayingField {
    object Size {
        var width = 4
        var height = 6
    }

    fun changeSize(width: Int, height: Int) {
        Size.width = width
        Size.height = height

    }
}
