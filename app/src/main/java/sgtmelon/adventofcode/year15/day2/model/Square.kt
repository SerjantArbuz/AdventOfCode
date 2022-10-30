package sgtmelon.adventofcode.year15.day2.model

data class Square(val length: Size.Length, val width: Size.Width, val height: Size.Height) {

    constructor(length: String, width: String, height: String) : this(
        Size.Length(length.toInt()),
        Size.Width(width.toInt()),
        Size.Height(height.toInt())
    )
}