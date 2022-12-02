package sgtmelon.adventofcode.year15.day7.model

sealed class Command(val to: String) {

    sealed class Bool(val left: String, val right: String, to: String) : Command(to) {
        class And(data: Triple<String, String, String>) : Bool(data.first, data.second, data.third)
        class Or(data: Triple<String, String, String>) : Bool(data.first, data.second, data.third)
    }

    sealed class Shift(val from: String, val value: Int, to: String) : Command(to) {
        class Left(data: Triple<String, Int, String>) : Shift(data.first, data.second, data.third)
        class Right(data: Triple<String, Int, String>) : Shift(data.first, data.second, data.third)
    }

    class Not(val from: String, to: String) : Command(to)

    class Set(val value: String, to: String) : Command(to)
}