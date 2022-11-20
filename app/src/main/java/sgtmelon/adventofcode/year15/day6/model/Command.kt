package sgtmelon.adventofcode.year15.day6.model

enum class Command(val value: String) {
    ON(value = "turn on"),
    OFF(value = "turn off"),
    TOGGLE(value = "toggle")
}