package sgtmelon.adventofcode.year15.day2.model

sealed class Size(val value: Int) {
    class Length(value: Int) : Size(value)
    class Width(value: Int) : Size(value)
    class Height(value: Int) : Size(value)
}