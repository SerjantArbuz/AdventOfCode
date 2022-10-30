package sgtmelon.adventofcode.year15.day2.model

data class Square(val length: Int, val width: Int, val height: Int) {

    val square = 2L * (length * width + width * height + height * length)

    val volume = length * width * height

    val smallestSide: Pair<Int, Int> get() {
        val list = listOf(length, width, height).sorted()
        return list[0] to list[1]
    }
}